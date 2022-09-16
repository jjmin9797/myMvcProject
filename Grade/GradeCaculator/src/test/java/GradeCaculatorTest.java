import bit.com.Course;
import bit.com.GradeCaculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class GradeCaculatorTest {
    //학점계산기 도메인 : 이수한 과목(객체지향프로그래밍, 자료구조, 중국어회화), 학점 계산기
    //객체지향프로그래밍, 자료구조, 중국어회화 --> 과목(코스) 클래스

    //이수한 과목을 전달하여 평균학점 계산 요청 -----> 학점 계산기 ---->


    @Test
    @DisplayName("학점 계산기 호출")
    void caculateGradeTest() {
        List<Course> courses = Arrays.asList(new Course("OOP", 3, "A"),
                new Course("자료구조", 3, "A"));
        GradeCaculator gradeCaculator = new GradeCaculator(courses);
        double gradeResult = gradeCaculator.caculateGrade();
        assertThat(gradeResult).isEqualTo(4.0);
    }


}
