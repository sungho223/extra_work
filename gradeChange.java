package extra_work;

public class gradeChange {
    private int korScore = 90;
    private int engScore = 88;
    private int mathScore = 70;
    private int progScore = 80;

    public gradeChange(int korScore, int engScore, int mathScore, int progScore) {
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
        this.progScore = progScore;
    }

    public static String gradeChangeA(int korScore, int engScore, int mathScore, int progScore) {
        double resultGradeA = (korScore + engScore + mathScore + progScore) / 4.0;

        String grade;
        if (resultGradeA >= 95) {
            grade = "A+";
        } else if (resultGradeA >= 90) {
            grade = "A";
        } else if (resultGradeA >= 85) {
            grade = "B+";
        } else if (resultGradeA >= 80) {
            grade = "B";
        } else if (resultGradeA >= 75) {
            grade = "C+";
        } else if (resultGradeA >= 70) {
            grade = "C";
        } else {
            grade = "D";
        }
        return grade;
    }

    public String intoGradeA() {
        double resultGradeB = (this.korScore + this.engScore + this.mathScore + this.progScore) / 4.0;

        String grade;
        if (resultGradeB >= 95) {
            grade = "A+";
        } else if (resultGradeB >= 90) {
            grade = "A";
        } else if (resultGradeB >= 85) {
            grade = "B+";
        } else if (resultGradeB >= 80) {
            grade = "B";
        } else if (resultGradeB >= 75) {
            grade = "C+";
        } else if (resultGradeB >= 70) {
            grade = "C";
        } else {
            grade = "D";
        }
        return grade;
    }

    public static void main(String[] args) {
        System.out.println(gradeChange.gradeChangeA(90, 88, 70, 80));
        gradeChange gc = new gradeChange(90, 88, 70, 80);
        System.out.println();

        System.out.println(gc.intoGradeA());
        System.out.println();
    }
}
