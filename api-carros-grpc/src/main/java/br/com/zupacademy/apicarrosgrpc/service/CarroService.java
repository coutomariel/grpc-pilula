package br.com.zupacademy.apicarrosgrpc.service;

import br.com.zupacademy.CarroGrpcServiceGrpc;
import br.com.zupacademy.CarroRequest;
import br.com.zupacademy.CarroResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

@Service
public class CarroService {


    public CarroResponse criarCarro(){

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9000).usePlaintext().build();
        CarroGrpcServiceGrpc.CarroGrpcServiceBlockingStub stub = CarroGrpcServiceGrpc.newBlockingStub(channel);


        CarroResponse response = stub.createCarro(CarroRequest.newBuilder()
                .setPlaca("IXX1414")
                .setModelo("Opala")
                .build());

        channel.shutdown();
        return response;
    }


}
