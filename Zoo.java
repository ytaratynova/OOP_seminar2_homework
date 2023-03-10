package OOP_seminar2_homework;

import java.util.ArrayList;
import java.util.List;


public class Zoo{
    private List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal){
        this.animals.add(animal);
        
        
    }

    public void deleteAnimal(Integer i){
        this.animals.remove(i - 1);
        System.out.println("Животное было удалено.");
        
    }

    public void showAnimal(Integer i){
        System.out.println("Животное, согласно запросу:");
        System.out.println(this.animals.get(i - 1));
        System.out.println();
               
    }

    public void makeVoice(Integer i){
        System.out.println("Животное сказало вам:");
        this.animals.get(i - 1).makeVoice();
        System.out.println();
               
    }

    public void printZoo(){
        System.out.println();
        System.out.println("ВСЕ ЖИВОТНЫЕ ЗООПАРКА:");
        System.out.println("**********************");
        for(int i = 0; i < animals.size(); i++){
            System.out.printf("%d. %s\n", i + 1, animals.get(i));
        }
        System.out.println();
    }    

    public void makeVoiceAllInZoo(){
        System.out.println();
        System.out.println("СЕЙЧАС БУДЕТ ГРОМКО:");
        System.out.println("**********************");
        for(int i = 0; i < animals.size(); i++){
            animals.get(i).makeVoice();
        }
        System.out.println();
    }

    public void showFeature(){
        for(Animal animal: animals){
            if (animal instanceof Kidness){
                System.out.println(animal.getClass().getSimpleName());
                ((Kidness) animal).kidness();
            }
            if (animal instanceof Train){
                System.out.println(animal.getClass().getSimpleName());
                ((Train) animal).train();
            }
            if (animal instanceof Fly){
                System.out.println(animal.getClass().getSimpleName());
                ((Fly) animal).fly();
                System.out.println();
            }
            
        }
        
    }

    
               
      
}
