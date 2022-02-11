import java.util.Scanner;


public class Launcher {
    public static int fibonacci(int n){
        int u1 = 0;
        int u2 = 1;
        int somme = 0;
        for (int i = 0; i < n; i++)
        {
            somme = u1 + u2;
            u1 = u2;
            u2 = somme;
        }
        return somme;
    }
    public static void main(String[] args) {
        System.out.println("Bienvenu");
        System.out.println("quelque chose");
        Scanner scanner= new Scanner(System.in);
        do {
            String instruction = scanner.next();
            if ("quit".equals(instruction))
                breaki;
            else if (rep.equals("fibo")){
                System.out.println("Entrer un entier n");
                int n = scanner.nextInt();
                scanner.nextLine();
                System.out.println(fibonacci(n));
            }
            else 
            {
                System.out.println("Unknown command");
            }
        } while (true);        
    }

}
