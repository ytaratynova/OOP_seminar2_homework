package OOP_seminar2_homework;

public abstract class Bird extends Animal implements Fly{
    
    private Integer flyHight;

    public Bird(Double height, Double weight, String eyes, Integer flyHight) {
        super(height, weight, eyes);
        this.flyHight = flyHight;
     
    }

    public Integer getFlyHeight(){
        return flyHight;
    }
    
    public void setFlyHeight(Integer flyHight){
        this.flyHight = flyHight;
    }

    
    @Override
    public void fly() {
        System.out.printf("Я лечу на высоте %d метра(ов)!", flyHight);
        
    }

    
   @Override
   public String toString() {
       return super.toString() + ", " +
              "высота полета: " + getFlyHeight() + "м.; ";
   }
}
