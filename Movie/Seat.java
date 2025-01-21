package Movie;

public class Seat {
    String seatCondition;   // clean, broken, dirty
    String seatReservation; // 예약 불가, 예약 가능
    String seatNumber;      // A11, D02, Z18   

    public Seat(){
        seatCondition = "clena";
        seatReservation = "possible to reserve";
        seatNumber = "a01";
    }

    public Seat(String condition, String reservation, String number){
        seatCondition = condition;
        seatReservation = reservation;
        seatNumber = number;
    }
}
