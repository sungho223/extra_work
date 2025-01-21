package Movie;

public class Speaker {
    String speakerCondition;    // on, off, broken
    String speakerBrand;        // sony

    public Speaker(){
        speakerCondition = "on";
        speakerBrand = "sony";
    }

    public Speaker(String condition){
        speakerCondition = condition;
        speakerBrand = "sony";
    }
    
}
