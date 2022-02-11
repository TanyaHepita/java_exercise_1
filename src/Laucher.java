import java.util.Scanner;


public class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenu");
        System.out.println("quelque chose");
        Scanner scanner= new Scanner(System.in);
        do {
            String instruction = scanner.next();
            if ("quit".equals(instruction))
                break;
            System.out.println("Unknown command");
        } while (true);        
    }

}
