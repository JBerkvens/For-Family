/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parameters;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeroen
 */
public abstract class Strings {

    private final String applicationTitle;
    private final String question1;
    private final String question2;
    private final String question3;
    private final String question4;
    private final String question5;
    private final String question6;
    private final String question7;
    private final String question8;
    private final String question9;
    private final String question10;
    private final String answer1;
    private final String answer2;
    private final String answer3;
    private final String answer4;
    private final String answer5;
    private final String answer6;
    private final String answer7;
    private final String answer8;
    private final String answer9;
    private final String answer10;
    private final String calculateButtonText;

    private Strings(String applicationTitle,
            String question1,
            String question2,
            String question3,
            String question4,
            String question5,
            String question6,
            String question7,
            String question8,
            String question9,
            String question10,
            String calculateButtonText) {
        this.applicationTitle = applicationTitle;
        this.question1 = question1;
        this.question2 = question2;
        this.question3 = question3;
        this.question4 = question4;
        this.question5 = question5;
        this.question6 = question6;
        this.question7 = question7;
        this.question8 = question8;
        this.question9 = question9;
        this.question10 = question10;
        this.answer1 = "A";
        this.answer2 = "B";
        this.answer3 = "C";
        this.answer4 = "D";
        this.answer5 = "A";
        this.answer6 = "B";
        this.answer7 = "C";
        this.answer8 = "D";
        this.answer9 = "A";
        this.answer10 = "B";
        this.calculateButtonText = calculateButtonText;
    }

    public String getApplicationTitle() {
        return applicationTitle;
    }

    public String getQuestion1() {
        return question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public String getQuestion3() {
        return question3;
    }

    public String getQuestion4() {
        return question4;
    }

    public String getQuestion5() {
        return question5;
    }

    public String getQuestion6() {
        return question6;
    }

    public String getQuestion7() {
        return question7;
    }

    public String getQuestion8() {
        return question8;
    }

    public String getQuestion9() {
        return question9;
    }

    public String getQuestion10() {
        return question10;
    }

    public String getCalculateButtonText() {
        return calculateButtonText;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public String getAnswer5() {
        return answer5;
    }

    public String getAnswer6() {
        return answer6;
    }

    public String getAnswer7() {
        return answer7;
    }

    public String getAnswer8() {
        return answer8;
    }

    public String getAnswer9() {
        return answer9;
    }

    public String getAnswer10() {
        return answer10;
    }

    public static class NL extends Strings {

        public NL() {
            super("Bereken je Score!",
                    "Vraag 1",
                    "Vraag 2",
                    "Vraag 3",
                    "Vraag 4",
                    "Vraag 5",
                    "Vraag 6",
                    "Vraag 7",
                    "Vraag 8",
                    "Vraag 9",
                    "Vraag 10",
                    "Bereken je Score");
        }
    }

    public static class EN extends Strings {

        public EN() {
            super("Calculate your Score!",
                    "Question 1",
                    "Question 2",
                    "Question 3",
                    "Question 4",
                    "Question 5",
                    "Question 6",
                    "Question 7",
                    "Question 8",
                    "Question 9",
                    "Question 10",
                    "Calculate your Score");
        }
    }

}
