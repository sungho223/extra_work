package Movie;

public class Projector {
    String projectorCondition;  // on, off, broken
    String projectorBrand;      // sony, cannon

    public Projector(){
        projectorCondition = "off";
        projectorBrand = "sony";
    }

    public Projector(String condition, String brand){
        projectorCondition = condition;
        projectorBrand = brand;
    }
}
