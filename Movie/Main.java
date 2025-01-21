package Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("극한직업", "이병헌", 111, "코미디");
        System.out.println("영화제목: " + movie.title + " \n감독: " + movie.supervision + "\n러닝타임: " + movie.runningTime + "\n분야: " + movie.filmField);
        System.out.println();

        Theater theater = new Theater("롯데시네마", "왕십리", "상영중");
        System.out.println("영화관: " + theater.theaterName + "\n장소: " + theater.theaterArea + "\n상영여부: " + theater.theaterCondition);
        System.out.println();

        Seat seat = new Seat("청결", "예약가능", "X10");
        System.out.println("좌석 상태: " +seat.seatCondition + "\n예약 가능 여부: " + seat.seatReservation + "\n좌석 번호: " + seat.seatNumber);
        System.out.println();

        AirConditioner airConditioner = new AirConditioner();
        System.out.println("목표온도: " + airConditioner.targeTemp + "\n현재 온도: " +  airConditioner.nowTemp + "\n에어컨, 히터 작동 종류: " +  airConditioner.heatingAndCooling + "\n작동 여부: "  + airConditioner.airconditionerCondition);
        System.out.println();

        Projector projector = new Projector();
        projector.projectorCondition = "on";
        projector.projectorBrand = "cannon";
        System.out.println("영사기 작동여부: " + projector.projectorCondition + "\n영사기 브랜드: " +projector.projectorBrand);

        Light light = new Light();
        System.out.println("조명 색깔: " + light.lightColor  +"\n조명 상태: " + light.lightCondition);
        System.out.println();

        Speaker speaker = new Speaker();
        speaker.speakerCondition = "고장";
        System.out.println("스피커 상태: " +speaker.speakerCondition + "\n스피커 브랜드: " + speaker.speakerBrand);
        System.out.println();

    }
}
