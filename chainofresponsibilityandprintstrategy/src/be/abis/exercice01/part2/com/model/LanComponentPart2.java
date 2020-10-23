package be.abis.exercice01.part2.com.model;


import be.abis.exercice01.part2.com.model.PacketPart2;

public abstract class LanComponentPart2 {
    public String address ="";

    public LanComponentPart2 nextComponent;
    public LanComponentPart2(String address){
        this.address = address;

    }

    public LanComponentPart2 getNextComponent(){
        return nextComponent;
    }
    public void setNextComponent (LanComponentPart2 nextComponent){
        this.nextComponent = nextComponent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address;
    }



    public abstract void send(PacketPart2 packet);


    public abstract void receive(PacketPart2 packet);
}
