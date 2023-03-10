package OOP_seminar2_homework;

import java.util.Iterator;
import java.util.Scanner;

public class Program {

    public static void menu(){
        System.out.println("------------------");
        System.out.println("ВЫБЕРИТЕ ДЕЙСТВИЕ:");
        System.out.println("------------------");
        System.out.println("1. Добавить животное в зоопарк.");
        System.out.println("2. Удалить животное из зоопарка.");
        System.out.println("3. Посмотреть информацию о животном.");
        System.out.println("4. Посмотреть информацию о всех животных зooпарка.");
        System.out.println("5. Заставить животное издать звук.");
        System.out.println("6. Заставить издать звук всех животных одновременно.");
        System.out.println("7. Показать способности животных нашего зоопарка.");
        System.out.println("8. Завершить работу");
    }

    public static void userAddAnimal(Scanner iScanner, Zoo zoo){
        System.out.println("Введите рост животного, в м.: ");
        Double animalHeight = iScanner.nextDouble();
        System.out.println("Введите вес животного, в кг.: ");
        Double animalWeight = iScanner.nextDouble();
        System.out.println("Введите цвет глаз животного: ");
        String animalEyes = iScanner.next();
        System.out.println("Выберите животное:");
        System.out.println("1. Курица;");
        System.out.println("2. Аист;");
        System.out.println("3. Кошка;");
        System.out.println("4. Собака;");
        System.out.println("5. Тигр;");
        System.out.println("6. Волк;");
        int userAnimal = iScanner.nextInt();
        switch (userAnimal){
            case 1:
                System.out.println("Введите высоту полета, в м.: ");
                int chickenFly = iScanner.nextInt();
                Chicken newChicken = new Chicken(animalHeight, animalWeight, animalEyes, chickenFly);
                zoo.addAnimal(newChicken);
                System.out.println("Животное добавлено.");
                break;
            case 2:   
                System.out.println("Введите высоту полета: ");
                int animalFly = iScanner.nextInt();
                Stork newStork = new Stork(animalHeight, animalWeight, animalEyes, animalFly);
                zoo.addAnimal(newStork);
                System.out.println("Животное добавлено.");
            case 3:   
                System.out.println("Введите кличку кошки/кота: ");
                String catName = iScanner.next();
                System.out.println("Введите породу кошки/кота: ");
                String catBreed = iScanner.next();
                System.out.println("Вакцинирован (true/false)? ");
                Boolean catVacc = iScanner.nextBoolean();
                System.out.println("Есть шерсть (true/false)? ");
                Boolean catHasWool = iScanner.nextBoolean();
                System.out.println("Цвет шерсти кошки/кота: ");
                String catWoolColor = iScanner.next();
                System.out.println("Дата рождения кошки/кота: ");
                String catBirth = iScanner.next();
                Cat newCat = new Cat(catName, catBreed, catVacc, catHasWool, catWoolColor, catBirth, animalHeight, animalWeight, animalEyes);
                zoo.addAnimal(newCat);
                System.out.println("Животное добавлено.");
            case 4:   
                System.out.println("Введите кличку собаки: ");
                String dogName = iScanner.next();
                System.out.println("Введите породу собаки: ");
                String dogBreed = iScanner.next();
                System.out.println("Вакцинирован (true/false)? ");
                Boolean dogVacc = iScanner.nextBoolean();
                System.out.println("Дрессирован (true/false)? ");
                Boolean dogTrained = iScanner.nextBoolean();
                System.out.println("Цвет шерсти собаки: ");
                String dogWoolColor = iScanner.next();
                System.out.println("Дата рождения собаки: ");
                String dogBirth = iScanner.next();
                Dog newDog = new Dog(dogName, dogBreed, dogVacc, dogWoolColor, dogBirth, animalHeight, animalWeight, animalEyes, dogTrained);
                zoo.addAnimal(newDog);
                System.out.println("Животное добавлено.");
                break;
            case 5:   
                System.out.println("Среда обитания: ");
                String tigerFrom = iScanner.next();
                System.out.println("Когда был найден: ");
                String tigerWasFound = iScanner.next();
                Tiger newTigger = new Tiger(tigerFrom, tigerWasFound, animalHeight, animalWeight, animalEyes);
                zoo.addAnimal(newTigger);
                System.out.println("Животное добавлено.");
                break;
            case 6:   
                System.out.println("Среда обитания: ");
                String wolfFrom = iScanner.next();
                System.out.println("Когда был найден: ");
                String wolfWasFound = iScanner.next();
                System.out.println("Вожак стаи (true/false)? ");
                Boolean wolfLeader = iScanner.nextBoolean();
                Wolf newWolf = new Wolf(wolfFrom, wolfWasFound, animalHeight, animalWeight, animalEyes, wolfLeader);
                zoo.addAnimal(newWolf);
                System.out.println("Животное добавлено.");
                break;
        
        }
                           
        

    }

    public static void main(String[] args) {
        Chicken birdChicken = new Chicken(0.35, 3.5, "черные", 1);
        Stork birdStork = new Stork(1.1, 8.5, "зеленые", 100);
        Cat petCat = new Cat("Барсик", "перс", true, true, "серый", "20.02.2020", 0.3, 3.2, "зеленые");
        Dog petDog = new Dog("Милли", "болонка", true, "белый", "28.02.2020", 0.3, 4.5, "черные", true);
        Tiger wildTiger = new Tiger("лес", "2012", 1.2, 120, "желтые");
        Wolf wildWolf = new Wolf("лес", "2020", 0.7, 53.6, "голубые", true);

        Zoo myZoo = new Zoo();
        myZoo.addAnimal(wildWolf);
        myZoo.addAnimal(wildTiger);
        myZoo.addAnimal(birdChicken);
        myZoo.addAnimal(birdStork);
        myZoo.addAnimal(petCat);
        myZoo.addAnimal(petDog);

        Scanner iScanner = new Scanner(System.in);
        while (true) {
            menu();
            int userInput = iScanner.nextInt();
            while (userInput > 9 & userInput < 1){
                menu();
            } 
            if (userInput == 8) {
                break;
            }

            switch (userInput){
                case 1:
                    userAddAnimal(iScanner, myZoo);
                    break;
                case 2:
                    System.out.println("Введите номер животного:");
                    int delAnimal = iScanner.nextInt();
                    myZoo.deleteAnimal(delAnimal);
                    break;
                case 3:
                    System.out.println("Введите номер животного:");
                    int showAnimal = iScanner.nextInt();
                    myZoo.showAnimal(showAnimal);
                    break;
                case 4:
                    myZoo.printZoo();
                    break;
                case 5:
                    System.out.println("Введите номер животного:");
                    int voiceAnimal = iScanner.nextInt();
                    myZoo.makeVoice(voiceAnimal);
                    break;
                case 6:
                    myZoo.makeVoiceAllInZoo();
                    break;
                case 7:
                    myZoo.showFeature();
                    break;
                case 8:
                    break;
                

            }

            
        
            
        }
        }    
        
    
    
}
