package br.com.zupacademy;

import io.quarkus.grpc.GrpcService;

import io.smallrye.mutiny.Uni;

import javax.inject.Singleton;

/**
@GrpcService
public class HelloGrpcService implements HelloGrpc {

    @Override
    public Uni<HelloReply> sayHello(HelloRequest request) {
        return Uni.createFrom().item("Hello " + request.getName() + "!")
                .map(msg -> HelloReply.newBuilder().setMessage(msg).build());
    }

}
**/