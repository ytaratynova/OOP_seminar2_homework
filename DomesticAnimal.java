// Так же реализовать следующие интерфейсы, реализующие интерфейс Животное:
// 1.Домашнее животное со следующими свойствами:
// 1.1 Кличка
// 1.2 Порода
// 1.3 Наличие прививок
// 1.4 Цвет шерсти
// 1.5 Дата рождения
// И методами:
// 1.5 Проявлять ласку

package OOP_seminar2_homework;

public abstract class DomesticAnimal extends Animal implements Kidness{
    private String name;
    private String breed;
    private Boolean vaccinations;
    private String woolColor;
    private String dateOfBirth;

    public DomesticAnimal(String name, String breed, Boolean vaccinations, String woolColor, 
                          String dateOfBirth, Double height, Double weight, String eyes){
        super(height, weight, eyes);
        this.name = name;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.woolColor = woolColor;
        this.dateOfBirth = dateOfBirth;
    }
        
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

        public Boolean getVaccinations() {
        return vaccinations;
    }

    public String getWoolColor() {
        return woolColor;
    }

    public String getDateOfBirh() {
        return dateOfBirth;
    }

    @Override
    public void kidness() {
        System.out.println("Любит ласку и когда чешут за ушком!");
    }

    @Override
    public String toString() {
        if (vaccinations){
            return getName() + ", " +
                "порода: " + getBreed() + ", " +
                "прививки: есть, "+
                "цвет шерсти: " + getWoolColor() + ", " +
                "дата рождения: " + getDateOfBirh() + "; " +
                super.toString();
        } else {
            return getName() + ", " +
                "порода: " + getBreed() + ", " +
                "прививки: отсутствуют, "+
                "цвет шерсти: " + getWoolColor() + ", " +
                "дата рождения: " + getDateOfBirh() + ", " +
                super.toString();

        }
    }
}
