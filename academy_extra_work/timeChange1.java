package academy_extra_work;

public class timeChange1 {
    private int minutes;
    private int seconds;

    public timeChange1(int minutes, int seconds){
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public static int change(int minutes, int seconds){
        return minutes * 60 + seconds;
    }

    public int intoSecond(){
        return this.minutes * 60 + this.seconds;
    }

    public static void main(String[] args) {
        int totalResult = timeChange1.change(5, 50);
        System.out.println(totalResult);

        timeChange1 timechange = new timeChange1(3,45);
        System.out.println(timechange.intoSecond());

    }
}


