package be.abis.exercice01.com.model;

public abstract class LanComponent {
    public String address ="";
    public LanComponent nextComponent;

    public LanComponent(String address){
        this.address = address;
    }
    public LanComponent getNextComponent(){
        return nextComponent;
    }
    public void setNextComponent (LanComponent lanComp){
        this.nextComponent = nextComponent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address;
    }

    public LanComponent getLan() {
        return nextComponent;
    }


    public abstract void send(Packet packet);


    public abstract void receive(Packet packet);


}
