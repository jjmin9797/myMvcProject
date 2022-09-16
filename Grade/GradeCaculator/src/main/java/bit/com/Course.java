package bit.com;

public class Course {


    private final String subject;
    private final int credit;
    private final String grade;

    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public int getCredit(){
        return credit;
    }

    public double getGradeToNumber(){
        double returnValue = 0;
        switch (this.grade) {
            case "A" :
                returnValue = 4.0;
                break;
            case "B" :
                returnValue = 4.0;
                break;
            case "C" :
                returnValue = 3.5;
                break;
            case "D" :
                returnValue = 3.0;
                break;
            case "E" :
                returnValue = 2.5;
                break;
        }
        return returnValue;
    }

}
