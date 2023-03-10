// На языке Java реализовать интерфейс "Животное" со следующими полями:
// 1.Рост животного
// 2.Вес животного
// 3.Цвет глаз животного
// И методы:
// 1.Издать звук
// 2.Напечатать информацию о животном


package OOP_seminar2_homework;

public abstract class Animal {
    protected Double height;
    protected Double weight;
    protected String eyes;

    public Animal(Double height, Double weight, String eyes){
        this.height = height;
        this.weight = weight;
        this.eyes= eyes;
    }

    public Double getHeight(){
        return height;
    }

    public Double getWeight(){
        return weight;
    }

    public String getEyes(){
        return eyes;
    }
    
    public abstract void makeVoice();

    public String toString(){
        return "рост: " + getHeight() + "м., " +
               "вес: " + getWeight() + "кг., " +
               "цвет глаз: " + getEyes();
    }

    
}
