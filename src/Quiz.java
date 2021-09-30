import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Question q1 = new Question("What is the capital of Ireland ? ", "Dublin");
        Question q2 = new Question("What is the capital of Lithuania ? ", "Vilnius");
        Question q3 = new Question("What day is a New Year ? ", "January 1");

        q1.displayQuestion();
        String answer = input.next();
        q1.isCorrect(answer);

        if(q1.isCorrect(answer)){
            System.out.println("Correct");
        }else
        {
            System.out.println("Incorrect");
        }


    }
}

