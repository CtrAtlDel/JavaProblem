package org.example;

import com.example.grpc.GreatingService;
import com.example.grpc.SimpleServiceGrpc;
import io.grpc.stub.StreamObserver;


public class SimpleServiceImpl extends SimpleServiceGrpc.SimpleServiceImplBase {
    /*Принимаем сразу и реквест и респонс, поскольку хотим использовать поток
    * состоящий из нескольких респонсов  */
    @Override
    public void greeting(GreatingService.Request request,
                         StreamObserver<GreatingService.Response> responseObserver) {
        System.out.println(request);
        GreatingService.Response response = GreatingService.Response.newBuilder()
                .setGreeting("Hello from server" + request.getName())
                .build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();
    }
}
