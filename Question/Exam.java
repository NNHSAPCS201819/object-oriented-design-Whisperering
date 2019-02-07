import java.util.ArrayList;
import java.util.Scanner;
/**
 * An exam *has a* list of questions.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exam
{
    /*
     * An exam object *has a* list of questions. An exam object &is not a* question.
    private ArrayLisr<Question> questions;
     */

    public Exam()
    {
        this.questions = new ArrayList<Question>();
    }

    public void addQuestion(Question q)

    {
        this.questions.add(g);
    }

    public void askQuestions()
    {
        // Scanner in = new Scanner(System.in);
        // for(Question q: questions)
        // {
        // System.out.println( q );
        // System.out.print("Your answer: ");
        // String response = in.nextLine();
        // System.out.println(q.checkAnswer(response));
        // }
        ChoiceQuestion q2 = new ChoiceQuestion("Who founded Apple?");
        q2.addChoice("Bill Gates", false);
        q2.addChoice("Steve Jobs", false);
    }
}
