import java.util.Random;
import java.util.Scanner;

public class R_P_S {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BOLD = "\033[1m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) throws InterruptedException {
        // intialiazation
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        // Randomize
        String[] array = { "Rock", "Paper", "Scissor" };
        int randomIndex = random.nextInt(array.length);
        String randomString = array[randomIndex];
        boolean running = true;
        int counter = 1;

        while (running) {
            // Player picking.....
            System.out.println("Session: " + counter);
            System.out.println(ANSI_RED + "Rock");
            System.out.println(ANSI_GREEN + "Paper");
            System.out.println(ANSI_YELLOW + "Scissor" + ANSI_RESET);
            System.out.print("Enter your move: ");
            String choice = sc.nextLine();
            System.out.println();

            // Checking the choice of the Player
            if (choice.equalsIgnoreCase("Rock") && randomString.equalsIgnoreCase("Rock")
                    || choice.equalsIgnoreCase("Paper") && randomString.equalsIgnoreCase("Paper")
                    || choice.equalsIgnoreCase("Scissor") && randomString.equalsIgnoreCase("Scissor")) {
                Thread.sleep(1000);
                System.out.println(ANSI_BOLD + "Player: " + choice + " VS " + "Computer: " + ANSI_BOLD + randomString
                        + ANSI_RESET);
                System.out.println();
                System.out.println(ANSI_BLUE + "DRAWW!!!" + ANSI_RESET);

            } else if (choice.equalsIgnoreCase("Rock") && randomString.equalsIgnoreCase("Scissor")
                    || choice.equalsIgnoreCase("Scissor") && randomString.equalsIgnoreCase("Paper")
                    || choice.equalsIgnoreCase("Paper") && randomString.equalsIgnoreCase("Rock")) {
                Thread.sleep(1000);
                System.out.println(ANSI_BOLD + "Player: " + choice + " VS " + "Computer: " + ANSI_BOLD + randomString
                        + ANSI_RESET);
                System.out.println();
                System.out.println(ANSI_GREEN + "You Won!!!" + ANSI_RESET);

            } else if (randomString.equalsIgnoreCase("Scissor") && choice.equalsIgnoreCase("Paper")
                    || randomString.equalsIgnoreCase("Paper") && choice.equalsIgnoreCase("Rock")
                    || randomString.equalsIgnoreCase("Rock") && choice.equalsIgnoreCase("Scissor")) {
                Thread.sleep(1000);
                System.out.println(ANSI_BOLD + "Player: " + choice + " VS " + "Computer: " + ANSI_BOLD + randomString
                        + ANSI_RESET);
                System.out.println();
                System.out.println(ANSI_RED + "Computer Won!!!" + ANSI_RESET);

            } else {
                System.out.println("Choose in the options!");
                continue;

            }

            while (running) {
                // ... rest of the code
                System.out.println();
                System.out.println("Y: Yes");
                System.out.println("N: No");
                System.out.print("Do you want to play again?: ");
                String Rechoice = sc.nextLine();

                if (Rechoice.equalsIgnoreCase("Y")) {
                    counter += 1;
                    running = true;
                    System.out.println();
                    break;
                } else if (Rechoice.equalsIgnoreCase("N")) {
                    System.out.println(ANSI_YELLOW + "Thanks for playing....." + ANSI_RESET);
                    running = false;
                    break;
                } else {
                    System.out.println("Choose in the options!");
                }
            }

        }

        sc.close();
    }
}
