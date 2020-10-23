package be.abis.exercice03.part3.com.model;

public class MessageQueServerPart3 extends PacketReceiveHandler {

   public MessageQueServerPart3(String address){
       super (address);
   }

    @Override
    public void process(PacketPart3 packet){
        System.out.println("fileserver verwerking");
    }
}

