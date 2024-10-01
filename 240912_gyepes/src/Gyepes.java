import java.util.Scanner;
    
public class Gyepes {
    static Scanner sc = new Scanner(System.in);
    public static void solution()
    {
        System.out.println("adja meg az atmerot!");
        String diameteString = sc.nextLine();
        Double diameter = Double.parseDouble(diameteString);
        Double radius = diameter/2;
        Double area = Math.pow(radius, 2);
        Double price = 2500.0;
        Double halfArea = area/2;
        Double cost = halfArea * price;
        System.out.println("Ár: " + cost);

    }
}
