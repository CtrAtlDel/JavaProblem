package org.example;

import com.example.grpc.GreatingService;
import com.example.grpc.SimpleServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.awt.*;

public class Client {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8080")
                .usePlaintext()
                .build();
        SimpleServiceGrpc.SimpleServiceBlockingStub stub =
                SimpleServiceGrpc.newBlockingStub(channel);

        GreatingService.Request request = GreatingService.Request
                .newBuilder()
                .setName(" Ivan")
                .build();
        GreatingService.Response response = stub.greeting(request); // Это и есть удаленный вызов процедуры
        System.out.println(response);
        channel.shutdownNow();
    }
}
