package br.com.zupacademy;

import io.grpc.stub.StreamObserver;
import io.quarkus.grpc.GrpcService;

import javax.inject.Singleton;
import java.util.UUID;

@Singleton
@GrpcService
public class CarroService extends CarroGrpcServiceGrpc.CarroGrpcServiceImplBase{

    @Override
    public void createCarro(CarroRequest request, StreamObserver<CarroResponse> responseObserver) {

        //

        CarroResponse response = CarroResponse.newBuilder()
                .setId(UUID.randomUUID().toString())
                .setPlaca(request.getPlaca())
                .setModelo(request.getModelo())
                .build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();


    }
}
