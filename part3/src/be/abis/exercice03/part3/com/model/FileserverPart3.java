package be.abis.exercice03.part3.com.model;

public class FileserverPart3 extends PacketReceiveHandler{
   public FileserverPart3(String address){
       super(address);
   }
   @Override
   public void process(PacketPart3 packet){
       System.out.println("fileserver verwerking");
   }
}
