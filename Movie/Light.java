package Movie;

public class Light {
    String lightColor;      // yellow, red, blue
    String lightCondition;  //on, off, broken

    public Light(){ // default value
        lightColor = "red";
        lightCondition = "on";
    }

    public Light(String color, String condition){
        lightColor = color;
        lightCondition = condition;
    }

}
