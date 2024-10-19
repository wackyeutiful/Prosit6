package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatiques{
    float swimmingDepth;

    @Override
    public void swim() {
        System.out.println("this penguin is swimming");
    }
}
