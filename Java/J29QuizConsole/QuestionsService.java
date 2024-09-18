package J29QuizConsole;

import java.util.Scanner;

public class QuestionsService {
    Question[] questions = new Question[5]; // Array to hold 5 questions
    String[] selection = new String[5]; // Array to store user's answers

    // Constructor to initialize questions
    public QuestionsService() {
        // Initialize the first question
        questions[0] = new Question();
        questions[0].setId(1);
        questions[0].setQuestions("Which of the following is a valid keyword in Java?");
        questions[0].setOp1("A. interface");
        questions[0].setOp2("B. string");
        questions[0].setOp3("C. Float");
        questions[0].setOp4("D. unsigned");
        questions[0].setAnswer("A");

        // Initialize the second question
        questions[1] = new Question();
        questions[1].setId(2);
        questions[1].setQuestions("Which of these methods is used to find out the length of a string in Java?");
        questions[1].setOp1("A. getSize()");
        questions[1].setOp2("B. length()");
        questions[1].setOp3("C. size()");
        questions[1].setOp4("D. lengthof()");
        questions[1].setAnswer("B");

        // Initialize the third question
        questions[2] = new Question();
        questions[2].setId(3);
        questions[2].setQuestions("Which of the following is not an access modifier in Java?");
        questions[2].setOp1("A. protected");
        questions[2].setOp2("B. public");
        questions[2].setOp3("C. transient");
        questions[2].setOp4("D. private");
        questions[2].setAnswer("C");

        // Initialize the fourth question
        questions[3] = new Question();
        questions[3].setId(4);
        questions[3].setQuestions("What is the size of int data type in Java?");
        questions[3].setOp1("A. 16 bits");
        questions[3].setOp2("B. 32 bits");
        questions[3].setOp3("C. 64 bits");
        questions[3].setOp4("D. 8 bits");
        questions[3].setAnswer("B");

        // Initialize the fifth question
        questions[4] = new Question();
        questions[4].setId(5);
        questions[4].setQuestions("Which keyword is used to declare a constant in Java?");
        questions[4].setOp1("A. const");
        questions[4].setOp2("B. final");
        questions[4].setOp3("C. static");
        questions[4].setOp4("D. constant");
        questions[4].setAnswer("B");
    }

    // Method to play the quiz
    public void playQuiz() {
        Scanner sc = new Scanner(System.in); // Create a scanner for user input
        int i = 0;
        int score = 0; // Variable to track the user's score

        // Loop through the questions and display them
        for (Question q : questions) {
            if (q != null) {
                // Display the question and options
                System.out.println("Question " + q.getId() + ": " + q.getQuestions());
                System.out.println(q.getOp1());
                System.out.println(q.getOp2());
                System.out.println(q.getOp3());
                System.out.println(q.getOp4());

                // Get user input
                System.out.print("Your answer: ");
                selection[i] = sc.nextLine(); // Store user's answer

                // Check if the answer is correct
                if (selection[i].equalsIgnoreCase(q.getAnswer())) {
                    score++; // Increment score if the answer is correct
                }

                i++; // Increment index for next question
            }
        }

        // Display the user's score
        System.out.println("\nYour Score: " + score + " out of " + questions.length);

        sc.close(); // Close the scanner
    }
}
