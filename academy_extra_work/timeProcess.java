package academy_extra_work;

public class timeProcess {
    private int processTime;

    public timeProcess(int processTime) {
        this.processTime = processTime;
    }

    public static int changeMinutes(int processTime) {
        return processTime / 60;
    }

    public static int changeSecond(int processTime) {
        return processTime % 60;
    }

    public int intoMinute() {
        return this.processTime / 60;
    }

    public int intoSecondB() {
        return this.processTime % 60;
    }

    public static void main(String[] args) {
        int processResultMinute = timeProcess.changeMinutes(145);
        int processResultSecond = timeProcess.changeSecond(145);
        System.out.println(processResultMinute + "분");
        System.out.println(processResultSecond + "초");
        System.out.println();

        timeProcess timeprocess = new timeProcess(145);
        System.out.println(timeprocess.intoMinute() + "분");
        System.out.println(timeprocess.intoSecondB() + "초");
    }
}
