package com.example.demo;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.grpc.Crud.CreateRequest;
import com.example.grpc.Crud.DeleteRequest;
import com.example.grpc.Crud.Employee;
import com.example.grpc.Crud.GetRequest;
import com.example.grpc.Crud.UpdateRequest;
import com.example.grpc.CrudServiceGrpc;
import com.example.grpc.CrudServiceGrpc.CrudServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@SpringBootApplication
public class GrpcClientPractiseApplication {

	private CrudServiceBlockingStub CrudServiceBlockingStub;
	private ManagedChannel channel;

	public GrpcClientPractiseApplication() {
		 channel = ManagedChannelBuilder.forAddress("localhost", 8087)
				.usePlaintext().build();
		
		CrudServiceBlockingStub = CrudServiceGrpc.newBlockingStub(channel);
	}
	
	public void createEmployee(String name, String role)
	{
		CreateRequest request = CreateRequest.newBuilder()
				.setName(name)
				.setRole(role)
				.build();
		
		Employee employee = CrudServiceBlockingStub.create(request);
		System.out.println("Created Employee: "+employee);
	}
	
	public void getEmployee(String Id)
	{
		GetRequest request = GetRequest.newBuilder()
				.setId(Id)
				.build();
		
		Employee employee = CrudServiceBlockingStub.get(request);
		System.out.println("Retrived Employee: "+ employee);
	}
	
	public void updateEmployee(String Id, String name, String role)
	{
		UpdateRequest request = UpdateRequest.newBuilder()
				.setId(Id)
				.setName(name)
				.setRole(role)
				.build();
		
		Employee employee = CrudServiceBlockingStub.update(request);
		System.out.println("Updated Employee: "+ employee);
	}
	
	public void deleteEmployee(String Id)
	{
		DeleteRequest request = DeleteRequest.newBuilder()
				.setId(Id)
				.build();
		
		Employee employee = CrudServiceBlockingStub.delete(request);
		System.out.println("Deleted Employee: "+ employee);
	}
	
	public void shutdown() throws InterruptedException
	{
		channel.shutdown().awaitTermination(10, TimeUnit.SECONDS);
	}

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(GrpcClientPractiseApplication.class, args);
		System.out.println("Inside Client Application");
		GrpcClientPractiseApplication clientApp = new GrpcClientPractiseApplication();
		clientApp.createEmployee("John Doe", "Engineer");
		clientApp.getEmployee("1");
		clientApp.updateEmployee("1", "John Doe", "Doctor");
		clientApp.deleteEmployee("1");
		
		clientApp.shutdown();
	}

}
