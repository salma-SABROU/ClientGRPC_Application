package ma.enset;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import ma.enset.stub.AppChatServiceGrpc;
import ma.enset.stub.Chat;

import java.io.IOException;
import java.util.Scanner;

public class MainClient {
    public static void main(String[] args) throws IOException {
        String message="";
        String nomClient;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrer votre NOM : ");
        nomClient=sc.nextLine();
        ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("localhost",6666)
                .usePlaintext()
                .build();
        AppChatServiceGrpc.AppChatServiceStub asyncStub= AppChatServiceGrpc.newStub(managedChannel);
        Chat.MessageRequest request= Chat.MessageRequest.newBuilder()
                .setCurrentFrom("Salma")
                .setCurrentTo("HOUDA")
                .build();

        StreamObserver<Chat.MessageRequest> performStream=asyncStub.sendMessage(new StreamObserver<Chat.MessageRespense>() {
            @Override
            public void onNext(Chat.MessageRespense messageRespense) {
                System.out.println(messageRespense.getCurrentFrom()+" : "+messageRespense.getCurrentMsg());
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        });
        System.out.println(" -------WELCOM-------");
        message= sc.next();

        while (!message.equals("exit")){
            if(!message.equals("")){
                Chat.MessageRequest currentRequest=Chat.MessageRequest.newBuilder()
                        .setCurrentMsg(message)
                        .setCurrentFrom(nomClient)
                        .build();
                performStream.onNext(currentRequest);
            }
            message= sc.nextLine();
        }

        performStream.onCompleted();
    }
}