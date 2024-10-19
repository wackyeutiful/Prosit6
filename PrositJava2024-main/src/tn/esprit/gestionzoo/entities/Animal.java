package tn.esprit.gestionzoo.entities;

public class Animal{
    private String family;
    private String name;
    private int age;
    boolean isMammal;
    public static int n=0;

    public Animal(String family,String name,int age){
        super();
        this.family=family;
        this.name=name;

        this.age=age;
    }
    public Animal(boolean isMammal){
        this.isMammal=isMammal;
    }
    public Animal(String family,String name,int age,boolean isMammal){
        this(family,name,age);
        this.isMammal=isMammal;
        n++;

    }
    public Animal(){

    }

    public Animal(int age){
        this.age=age;
    }
    public Animal(String name){
        this.name=name;
    }
    public static void getNbr(){
        System.out.println(n);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age >= 0){
            this.age=age;
        }else{
            System.out.println("Lage doit etre positif");
        }

    }
    public void afficher(){
        System.out.println("Family:"+family+" Name:"+name+" age:"+age+" isMammal:"+isMammal);
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    public String getFamily() {
        return family;
    }


    public void setFamily(String family) {
        this.family = family;
    }
    public boolean equals(Object obj){
        if(obj instanceof Animal){
            if(this.age==((Animal)obj).age && this.name.equals(((Animal)obj).name)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }

    }
}
