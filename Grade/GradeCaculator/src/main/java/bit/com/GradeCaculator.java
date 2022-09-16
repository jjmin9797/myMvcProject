package bit.com;

import java.util.List;

public class GradeCaculator {

    private List<Course> courses;

    public GradeCaculator(List<Course> courses) {
        this.courses = courses;
    }

    public double caculateGrade() {
        double multipliedCreditAndCourseGrade = 0;
        for (Course course : courses) {
            multipliedCreditAndCourseGrade += course.getCredit() * course.getGradeToNumber();

        }

        int totalCompletedCredit = courses.stream()
                .mapToInt(Course::getCredit)
                .sum();


        return multipliedCreditAndCourseGrade / totalCompletedCredit;
    }
}
