package OOP_seminar2_homework;

public class Tiger extends WildAnimal {

    public Tiger(String habitat, String dateWasFound, Double height, double weight, String eyes) {
        super(habitat, dateWasFound, height, weight, eyes);
        
    }

    @Override
    public void makeVoice() {
        System.out.println("Ррррррррррр!");;
    }
    
    @Override
    public String toString() {
        return "Тигр, " + 
                super.toString();
    }
}
