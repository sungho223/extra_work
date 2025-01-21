package Movie;

public class AirConditioner {
    double targeTemp;               // 27.0
    double nowTemp;                 // 22.0
    String heatingAndCooling;       // heating, cooling
    String airconditionerCondition; // on, off, broken

    public AirConditioner(){    //default value
        targeTemp = 27.0;
        nowTemp = 20.0;
        heatingAndCooling = "Cooling";
        airconditionerCondition = "on";
    }

    public AirConditioner(double target, double now, String hc, String condition){
        targeTemp = target;
        nowTemp = now;
        heatingAndCooling = hc;
        airconditionerCondition = condition;
    }
}
