package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    public Aquatiques[] aquaticAnimals;
    private String name;
    private String city;
    final int nbrCages=25;
    int n=0;
    int n1=0;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        animals=new Animal[nbrCages];
        aquaticAnimals=new Aquatiques[10];
    }
    void displayZoo(){
        System.out.println("Name:"+name+" City:"+city+" NbrCages:"+nbrCages);
    }
    public boolean addAquaticAnimal(Aquatiques aquatiques){
        if(n1<10){
            aquaticAnimals[n1]=aquatiques;
            n1++;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean addAnimal(Animal animal){
        if(!isZooFull()){
            if(searchAnimal(animal)==-1){
                animals[n]=animal;
                n++;
                return true;
            }
            return false;

        }
        else {
            System.out.println("Le zoo est plein");
            return false;
        }
    }
    public boolean isZooFull(){
        return n==nbrCages;
    }
    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        /*if(z1.n>z2.n){
            return z1;
        }
        else{
            return z2;
        }*/
        return z1.n>z2.n ? z1 :z2;
    }
    public Zoo comparerZoo(Zoo zoo) {
        /*if(zoo.n>this.n){
            return zoo;
        }
        else{
            return this;
        }*/
        return zoo.n>this.n ? zoo :this;
    }
    public boolean removeAnimal(Animal animal){
        int index=searchAnimal(animal);
        if(index==-1){
            System.out.println("tn.esprit.gestionzoo.entities.Animal non trouve");
            return false;
        }else{
            for(int i=index;i<n-1;i++){
                animals[i]=animals[i+1];
            }
            animals[n-1]=null;
            n--;
            return true;

        }
    }
    public int searchAnimal(Animal animal){
        for(int i=0;i<n;i++){
            if(animals[i].getName().equals(animal.getName())){
                return i;
            }

        }
        return -1;
    }
    @Override
    public String toString(){
        System.out.println("tn.esprit.gestionzoo.entities.Zoo:");
        /*for(int i=0;i<n;i++){
            System.out.println(animals[i]);
        }*/
        for(Animal a:animals){
            if(a!=null){
                System.out.println(a);
            }

        }
        //System.out.println(Arrays.toString(animals));

        return "Name:"+name+" City:"+city+" NbrCages:"+nbrCages;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
        }

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float maxPenguinSwimmingDepth(){
        float max=0;
        for(int i=0;i<n1;i++){
            if(aquaticAnimals[i] instanceof Penguin){
                if(((Penguin) aquaticAnimals[i]).swimmingDepth>max){
                    max=((Penguin) aquaticAnimals[i]).swimmingDepth;
                }
            }
        }
        return max;
    }
    public void displayNumberOfAquaticsByType(){
        int nbd=0;
        int nbp=0;
        for(int i=0;i<n1;i++){
            if(aquaticAnimals[i] instanceof Penguin){
                nbp++;
            }
            if(aquaticAnimals[i] instanceof Dolphin){
                nbd++;
            }
        }
        System.out.println("Nbr dolphin="+nbd+" Nbr penguin="+nbp);
    }
}
