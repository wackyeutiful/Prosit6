package tn.esprit.gestionzoo.main;

import java.util.Objects;
import java.util.Scanner;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {


        /*int nbrCages;
        String zooName;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Veuillez entrer le nom du zoo:");
        zooName=scanner.nextLine();
        System.out.println("Veuillez entrer le nombre de cages:");
        nbrCages=scanner.nextInt();
        System.out.printf("%s comporte %d cages",zooName,nbrCages);*/
        Animal animal=new Animal("Felidae","Lion",5,true);
        Animal animal1=new Animal("Felidae","Lion1",5,true);
        Animal animal2=new Animal("Felidae","Lion2",5,true);
        Animal animal3=new Animal("Felidae","Lion3",5,true);
        Animal animal4=new Animal("Felidae","Lion",5,true);
        System.out.println(animal.getAge());
        animal.setAge(-5);
        System.out.println(animal.equals(animal1));



        Zoo zoo=new Zoo("Belveder","Tunis");
        animal.afficher();
        zoo.addAnimal(animal);
        zoo.addAnimal(animal1);
        zoo.addAnimal(animal2);
        zoo.addAnimal(animal3);
        zoo.addAnimal(animal4);
        System.out.println(zoo);
        System.out.println(zoo.searchAnimal(animal));
        System.out.println(zoo.searchAnimal(animal4));




        System.out.println(Animal.n);

        Zoo z1=new Zoo("aaaa","aaa");
        Zoo z2=new Zoo("bbbb","bbbb");
        Zoo z3=new Zoo("cccc","cccc");
        z3.comparerZoo(z2,z3);
        z2.comparerZoo(z3);
        z1.comparerZoo(z2);


        Aquatiques a=new Dolphin();
        Terrestres t=new Terrestres();
        Dolphin d=new Dolphin();
        Penguin penguin=new Penguin();


        a.swim();
        penguin.swim();
        d.swim();

        Animal animal5=new Animal();

        Animal animal6=new Terrestres();
        if(animal6 instanceof Aquatiques){
            ((Aquatiques)animal6).sayHello();
        }






        System.out.println((float)5/2);
        String str1="Hello";
        String str2="Hello";
        String str3=new String("Hello");
        System.out.println(str1.equals(str3));


        zoo.addAquaticAnimal(a);
        zoo.addAquaticAnimal(new Penguin());
        zoo.addAquaticAnimal(new Dolphin());
        for(Aquatiques aquatiques:zoo.aquaticAnimals){
            if(aquatiques!=null){
                aquatiques.swim();
            }
        }













    }
}
