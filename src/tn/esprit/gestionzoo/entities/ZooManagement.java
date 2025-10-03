package tn.esprit.gestionzoo.entities;

public class ZooManagement {

    String zooName="my zoo";
    int nbrCage=20;

    public ZooManagement() {}
    public ZooManagement(String zooName, int nbrCages) {
        this.zooName = zooName;
        nbrCage = nbrCages;
    }

    public String toString(){
        return zooName+" Comporte  "+nbrCage+" Cages";
    }

}