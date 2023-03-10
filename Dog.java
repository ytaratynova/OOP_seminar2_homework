// 3.Собака со свойством:
// 3.1 Наличие дрессировки(доступным только для чтения внешним классам)
// и методом:
// 3.2 Дрессировать

package OOP_seminar2_homework;

public class Dog extends DomesticAnimal implements Train {
    private Boolean trained;

    public Dog(String name, String breed, Boolean vaccinations, String woolColor, String dateOfBirth, Double height,
            Double weight, String eyes, Boolean trained) {
        super(name, breed, vaccinations, woolColor, dateOfBirth, height, weight, eyes);
        this.trained = trained;
    }

       public Boolean getTrained(){
        return trained;
    }
 
    public void trainMe(){
        System.out.println("Дрессировать");
    }


    @Override
    public void makeVoice() {
        System.out.println("Гав-гав!");;
    }
    
    @Override
    public String toString() {
        if (trained) {
            return "Собака: " + 
                    super.toString() + ", " +
                    "наличие дрессировки: да;";
     } else {
            return "Собака: " + 
                    super.toString() + ", " +
                    "наличие дрессировки: нет;";
     }        
    }

    @Override
    public void train() {
        System.out.println("Выполняю команды - 'сидеть', 'ко мне', 'рядом'!");
        
    }
}
