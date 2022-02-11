import java.util.Scanner;

public class Fibo implements Command{
    @Override
    public String name(){
        return "fibo";
    }
    @Override
    public boolean run(Scanner scanner){
        System.out.println("Entrer un nombre n");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println(fibonacci(n));
        return false;

    }
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


}
