package tn.esprit.gestionzoo.entities;

public class Terrestres extends Animal{
    int nbrLegs;
    public Terrestres(String family,String name,int age,int nbrLegs){
        super(family,name,age);
        this.nbrLegs=nbrLegs;
    }
    public Terrestres(){

    }

}

