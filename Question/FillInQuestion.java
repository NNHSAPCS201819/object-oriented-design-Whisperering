import java.util.Scanner;
/**
 * A FillInQuestion is constructed with a string that contains the answer 
 *  surrounded by '_'. For example, "The inventor of Java is\_James Gosling_."
 *  The question should be displayed as: The inventor of Java is _____.
 *
 * @author Evelina Mileko
 * @version 02/06/2019
 */

/*
 * The FillInQuestion class extends (i.i., is a subclass of) the Question class.
 */
public class FillInQuestion extends Question
{
    /*
     * Do not declare instance variables for text and answer! The text and answer
     *      instance variables are inherited from teh Question class.
     */
    
    /**
     * Constructs a FillInQuestion object with the specified text that contains
     *      the answer.
     *      
     *      @param  question    the specified question text with embedded answer
     */
    public FillInQuestion(String question)
    {
        /*
         * Explicitly call teh Question class's constructor that takes a string
         *      parameter. Calling a superclass's constructor must be teh first 
         *      line of code in the subclass's constructor.
         *      
         * if we don't explicitly call that superclass's constructor, Java will 
         * automatically call teh superclass's default (i.e., ) constructor.
         */
        super(question);
    }
    
    /**
     * This method overrides the setText method in the Question class.
     * 
     * Sets the question text and the answer.
     * 
     * @param   questionText    the text of teh question including the answer
     */
    /*
     * Use the @Override annotation when overriding a method to help teh compiler
     *      verify that you are overriding and Not overloading.
     */
    @Override
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "_____" + parser.next();
        
        /*
         * The inherited instance variables are private; they cannot be directly
         *      accessed. We must use the mutator and acessor methods.
         */
        //this.text = question;
        //this.answer = answer;
        
        /*
         * Use teh "super" reserved work to call the setText mathod as defined in
         *      teh superclass (e.g., Question)
         */
        super.setText(question);
        
        /*
         * Should use the "this" reserved work to call teh setAnswer method. If
         *      the subclass doesn't override the method, the superclass's
         *      method will be caleed.
         *      
         * We don't want to use "super" in this case because if we later override
         *      setAnswer, the overriden method will not be called.
         */
        this.setAnswer(answer);
    }
}
