// Реализовать классы следующих животных, реализующих интерфейсы домашнего животного или дикого
//  животного(надеюсь сами поймёте какое животное домашнее, а какое - дикое):
// 1.Кот со свойством:
// 1.1 Наличие шерсти(доступным только для чтения внешним классам)


package OOP_seminar2_homework;

public class Cat extends DomesticAnimal {
    private Boolean hasWool;
    
    public Cat(String name, String breed, Boolean vaccinations, Boolean hasWool, String woolColor, String dateOfBirth, Double height,
            Double weight, String eyes) {
        super(name, breed, vaccinations, woolColor, dateOfBirth, height, weight, eyes);
        this.hasWool = hasWool;
    }

    public Boolean getHasWool(){
        return hasWool;
    }

    @Override
    public void makeVoice() {
        System.out.println("Мяу-мяу!");
    }

    @Override
    public String toString() {
        if (getHasWool()){
            return "Кот/кошка: " + 
                    super.toString()  + ", " +
                    "шерсть: есть;";
                    
        } else {
            return "Кот/кошка: " + 
                super.toString()  + ", " +
                "шерсть: нет;";
        }
    }
    
}
