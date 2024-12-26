import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];
    int score = 0;

    public QuestionService(){
        questions[0] = new Question(1, "Size of int?", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "Size of double?", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "Size of char?", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "Size of long?", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "Size of boolean?", "1", "2", "4", "8", "1");
    }
    
    public void PlayQuiz(){
        for(int i = 0; i<5; i++){
            System.out.println("Ques no. : " + questions[i].getId());
            System.out.println(questions[i].getQuestion());
            System.out.println("Option1 : " + questions[i].getOpt1());
            System.out.println("Option2 : " + questions[i].getOpt2());
            System.out.println("Option3 : " + questions[i].getOpt3());
            System.out.println("Option4 : " + questions[i].getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            if (selection[i].equals(questions[i].getAnswer())) {
                score++;
            }        
        }
        for (String s : selection) {
            System.out.println(s);
        }
    }
    public void getScore(){
        System.out.println("Final score is : " + score + " out of 5.");
    }
}
