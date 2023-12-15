import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class task4 {
    private static final int QUIZ_DURATION_SECONDS = 10;
    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public static void main(String args[]) {
        startQuiz();
        scheduler.shutdown(); // Shutdown the scheduler when the quiz is completed
    }

    private static void startQuiz() {
        System.out.println("Welcome to the Quiz! You have " + QUIZ_DURATION_SECONDS + " seconds to answer.");

        // Quiz questions and answers
        String[] questions = {
            "What is the capital of Japan?",
            "Which programming language is known for its 'write once, run anywhere' philosophy?",
            "What is the largest ocean on Earth?"
        };

        String[] correctAnswers = {"Tokyo", "Java", "Pacific"};

        // Start the timer
        ScheduledFuture<?> quizEnd = scheduler.schedule(() -> {
            System.out.println("\nTime's up! Quiz ended.");
            System.exit(0);
        }, QUIZ_DURATION_SECONDS, TimeUnit.SECONDS);

        // Start asking questions
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(correctAnswers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + correctAnswers[i]);
            }
        }

        // Display final score
        System.out.println("\nQuiz completed. Your score: " + score + "/" + questions.length);

        // Cancel the timer if the quiz is completed before the timer expires
        if (!quizEnd.isDone()) {
            quizEnd.cancel(true);
        }
    }
}
