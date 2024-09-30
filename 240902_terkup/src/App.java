import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Kup terfogat szamitasa:");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Add meg a magassagot: ");
        String heightStr = scanner.nextLine();
        Double height = Double.parseDouble(heightStr);

        System.out.print("Add meg az atmerot: ");
        String radiusStr = scanner.nextLine();
        Double radius = Double.parseDouble(radiusStr);

        System.out.println("Terfogat: "+startCalc(height, radius));

        scanner.close();
    }

    public static double startCalc(Double height, Double radius)
    {
        Double ansVolume = (1./3)*Math.pow(radius, 2)*Math.PI*height;
        return ansVolume;

    }
}
