package be.abis.exercice03.part3.com.model;

public class PrintServerPart3 extends PacketReceiveHandler {
    public PrintStrategyPart3 printer;
    public PrintServerPart3(String address, PrintStrategyPart3 printer){
        super(address);
        this.printer = printer;
    }

    @Override
    public void process(PacketPart3 packet){

        if(packet.getDestinationAdress().equals(address)){
            printer.print(packet);
        } else {
            this.send(packet);
        }
    }/*
    public void print (PacketPart2 packet){
        System.out.println("the packet is printed by "+ getClass().getSimpleName()+ " with content " + packet.getContents());

    }*/
}
