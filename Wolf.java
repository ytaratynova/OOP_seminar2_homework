package OOP_seminar2_homework;

public class Wolf extends WildAnimal {
    private Boolean leader;

    public Wolf(String habitat, String dateWasFound, Double height, Double weight, String eyes, Boolean leader) {
        super(habitat, dateWasFound, height, weight, eyes);
        this.leader = leader;
    }

    

    public Boolean getLeader(){
        return leader;
    }

    @Override
    public void makeVoice() {
        System.out.println("УУУУУУууууу!");;
    }

    @Override
    public String toString() {
        if (leader){
        return "Волк, " + 
                "вожак стаи: да, " +
                 super.toString();
        } else {
        return "Волк, " + 
            "вожак стаи: нет, " + 
             super.toString();

        }
    }
}
