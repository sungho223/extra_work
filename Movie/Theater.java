package Movie;

public class Theater {
    String theaterName;         // 롯데시네마, CGV
    String theaterArea;         // 낙성대, 잠실, 성수, 왕십리
    String theaterCondition;    // 휴일, 상영중

    public Theater(String name, String area, String condition){
        theaterName = name;
        theaterArea = area;
        theaterCondition = condition;
    }
    
}
