package be.abis.exercice03.part3.com.model;


public abstract class LanComponentPart3 {
    public String address ="";

    public LanComponentPart3 nextComponent;
    public LanComponentPart3(String address){
        this.address = address;

    }

    public LanComponentPart3 getNextComponent(){
        return nextComponent;
    }
    public void setNextComponent (LanComponentPart3 nextComponent){

        this.nextComponent = nextComponent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address;
    }



    public abstract void send(PacketPart3 packet);


    public abstract void receive(PacketPart3 packet);
}
