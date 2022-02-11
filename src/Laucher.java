import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;



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
    public static List<String> word_freq(String str){
        str = str.toLowerCase().replaceAll("[.!?\\-'\"\n]", " ");

        Map<String, Integer> wofreq = new HashMap<>();

        for (var word : str.split(" ")){
            if (word.isBlank()) continue;

            wofreq.putIfAbsent(word,0);
            wofreq.put(word, wofreq.get(word) + 1);
        }

        List<String> mots = new ArrayList<>();

        while (mots.size() < 3 && wofreq.keySet().size() > 0){
            int max = Collections.max(wofreq.values());
            var keys = wofreq.keySet().stream().filter(k -> wofreq.get(k) == max).collect(Collectors.toList());
            var last = keys.get(keys.size() - 1);
            mots.add(last);
            wofreq.remove(last);
        }
        return mots;

    }


    public static void main(String[] args) {
        System.out.println("Bienvenu");
        System.out.println("quelque chose");
        Scanner scanner= new Scanner(System.in);
        do {
            String instruction = scanner.next();
            if ("quit".equals(instruction))
                break;
            else if (rep.equals("freq")){
                System.out.println("Quel est le chemin du fichier ?");
                String chemin = scanner.nextLine();
                Path file = Paths.get(chemin);
                String content;
                try {
                    content = Files.readString(file);
                }
                catch (Exception e) {
                    System.err.println("Unreadable file: " + e.getMessage());
                    break;
                }
                List<String> mots = word_freq(content);
                System.out.println(String.join(" ",mots));
            }    
            else 
            {
                System.out.println("Unknown command");
            }
        } while (true);        
    }

}
