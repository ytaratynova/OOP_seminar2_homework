package OOP_seminar2_homework;

public class Stork extends Bird {

    public Stork(Double height, Double weight, String eyes, Integer flyHight) {
        super(height, weight, eyes, flyHight);
        
    }

    @Override
    public void makeVoice() {
        System.out.println("Чм-чп-чм-чп!");
    }
    
    @Override
    public String toString() {
        return "Аист" + ", " +
                super.toString();
    }
}
