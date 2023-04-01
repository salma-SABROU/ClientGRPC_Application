package ma.enset;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.AbstractStub;
import io.grpc.stub.StreamObserver;
import ma.enset.stub.AppChatServiceGrpc;
import ma.enset.stub.Chat;
import ma.enset.stub.NbrMagique;
import ma.enset.stub.NombreMagiqueGrpc;

import java.io.IOException;
import java.util.Scanner;

public class MainClientNbr {
    public static void main(String[] args) throws IOException {
        double message=0;
        final int[] fin = {0};
        Scanner sc=new Scanner(System.in);
        ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("localhost",5555)
                .usePlaintext()
                .build();

        NombreMagiqueGrpc.NombreMagiqueStub asyncStub=NombreMagiqueGrpc.newStub(managedChannel);

        StreamObserver<NbrMagique.BroadMsgRequest> performStream=asyncStub.broadcastMsg(new StreamObserver<NbrMagique.BroadMsgResponse>() {
            @Override
            public void onNext(NbrMagique.BroadMsgResponse broadMsgResponse) {
                System.out.println("SERVER : "+broadMsgResponse.getMsg());
                /*if(broadMsgResponse.getMsg().equals("BRAVOO VOUS AVEZ TROUVER LE NOMBRE ^-^")){
                    fin[0] =1;
                }*/
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                System.out.println("-----------------fin du jeu-----------------");
                System.exit(0);
            }
        });

        System.out.println(" -------WELCOM-------");
        System.out.println("Entrer votre NOM : " );
        String nom=sc.nextLine();

        while (fin[0] !=1){
            System.out.println("Entrer le nombre : ");
            message= sc.nextDouble();
            NbrMagique.BroadMsgRequest currentRequest=NbrMagique.BroadMsgRequest.newBuilder()
                    .setFrom(nom)
                    .setMsg(message)
                    .build();
            performStream.onNext(currentRequest);
        }
        System.out.println("-----------------fin du jeu-----------------");
        performStream.onCompleted();
    }
}