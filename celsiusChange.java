package extra_work;

public class celsiusChange {
    private int celsius;

    public celsiusChange(int celsius){
        this.celsius = celsius;
    }

    public static double changeTemp(int celsius){
        return (celsius * 9.0 / 5) + 32;
    }

    public double intoTemp(){
        return (this.celsius * 9.0 / 5) + 32;
    }

    public static void main(String[] args) {
        double tempResult = celsiusChange.changeTemp(30);
        System.out.println("변환된 값: " + tempResult);
        System.out.println();

        celsiusChange celsiuschange = new celsiusChange(30);
        System.out.println("변환된 값: " + celsiuschange.intoTemp());
        System.out.println();
    }
}
