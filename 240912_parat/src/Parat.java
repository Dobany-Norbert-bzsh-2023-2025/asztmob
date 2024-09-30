import java.util.Scanner;

public class Parat {
    Scanner scanner = new Scanner(System.in);
    public void decider()
    {        
        System.out.println("Adj be egy szamot!");
        String numStr = scanner.nextLine();  
        Double num = Double.parseDouble(numStr);
        if (num%2==0) {
            System.out.println("Páros");
        }
        else
        {
            System.out.println("Páratlan");
        }
    }
}
