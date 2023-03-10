// 2.Дикое животное со следующими свойствами:
// 2.1 Место обитания
// 2.2 Дата нахождения

package OOP_seminar2_homework;

public abstract class WildAnimal extends Animal {
    private String habitat;
    private String dateWasFound;

    public WildAnimal(String habitat, String dateWasFound, Double height, Double weight, String eyes){
        super(height, weight, eyes);
        this.habitat = habitat;
        this.dateWasFound = dateWasFound;
    }

    public String getHabitat(){
        return habitat;
    }

    public String getDateWasFound(){
        return dateWasFound;
    }
        
    @Override
    public String toString() {
        return super.toString() + ", " +
                "место обитания: " + getHabitat() + ", " +
                "дата нахождения: " + getDateWasFound() + "г.; ";
    }
}
