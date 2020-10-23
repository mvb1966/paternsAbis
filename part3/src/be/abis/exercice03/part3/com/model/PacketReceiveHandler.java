package be.abis.exercice03.part3.com.model;

public abstract class PacketReceiveHandler extends NodePart3{
    public PacketReceiveHandler(String address){
        super(address);
    }
    public void receive(PacketPart3 packet) {
        System.out.println("packetReceivehandle " + packet.getDestinationAdress()+ " eigen adress " + address);
        if (packet.getDestinationAdress().equals(address)){
            this.process(packet);
        } else {
            this.send(packet);
        }
    }
    public abstract void process(PacketPart3 packet );

}
