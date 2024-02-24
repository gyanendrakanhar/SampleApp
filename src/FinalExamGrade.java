import java.util.Scanner;

public class FinalExamGrade {

    public static void main(String[] args) {

        Scanner grade = new Scanner(System.in);
        System.out.println("What is the mark of Maths?");
        int math = grade.nextInt();
        System.out.println("What is the mark of Science?");
        int science = grade.nextInt();
        System.out.println("What is the mark of English?");
        int english = grade.nextInt();

        int average = (math+science+english)/3;
        System.out.println(average);

        if(average >= 90){
            System.out.println("Grade in Final Exam is: A");
        } else if (average >= 70 && average < 90) {
            System.out.println("Grade in Final Exam is: B");
            
        } else if (average >= 50 && average < 70) {
            System.out.println("Grade in Final Exam is: C");
        } else {
            System.out.println("Grade in Final Exam is: D");
        }
    }
}
