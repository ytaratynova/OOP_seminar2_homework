package OOP_seminar2_homework;

public class Chicken extends Bird {

    public Chicken(Double height, Double weight, String eyes, Integer flyHight) {
        super(height, weight, eyes, flyHight);
    }

    @Override
    public void makeVoice() {
        System.out.println("Ко-ко-ко!");
    }
    
    @Override
    public String toString() {
        return "Курица" + ", " +
                super.toString();
    }

 }
