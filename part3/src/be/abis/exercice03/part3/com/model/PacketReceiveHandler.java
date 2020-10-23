package be.abis.exercice03.part3.com.model;

public abstract class PacketReceiveHandler extends NodePart3{
    public PacketReceiveHandler(String address){
        super(address);
    }
    public void send(PacketPart3 packet) {
        this.process(packet);
    }
    public abstract void process(PacketPart3 packet );

}
