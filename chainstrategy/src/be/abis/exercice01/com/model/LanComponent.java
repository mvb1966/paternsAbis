package be.abis.exercice01.com.model;

public abstract class LanComponent {
    public String Address ="";
    public LanComponent nextComponent= null;
    private LanComponent lan;
    public LanComponent getNextComponent(){
        return lan;
    }
    public void setNextComponent (LanComponent lanComp){
        this.lan = lanComp;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public LanComponent getLan() {
        return lan;
    }

    public void setLan(LanComponent lan) {
        this.lan = lan;
    }
    public void send(Packet packet){

    }
    public void receive(Packet packet){

    }
}
