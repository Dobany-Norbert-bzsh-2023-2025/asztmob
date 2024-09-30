import java.util.Scanner;

public class App
{
	public static void main(String[] args)
	{
		System.out.println("Rombusz terulet - kerulet szamitasa:");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Oldal hossz: ");
		String sideStr = scanner.nextLine();
		Double side = Double.parseDouble(sideStr);
		
		System.out.print("Alfa szog: ");
		String alphaStr = scanner.nextLine();
		Double alpha = Double.parseDouble(alphaStr);
		
		/*System.out.print("Beta szog: ")
		String betaStr = scanner.nextLine();
		Double beta = Double.parseDouble(betaStr)*/
		
		System.out.printf("Kerulet: %f",calcCirc(side));
		System.out.println();
		System.out.printf("Terulet: %f",calcArea(side,alpha));
	}
	
	public static Double calcCirc (Double side)
	{
		return side*4;
	}
	
	public static Double calcArea (Double side, Double alpha/*, Int beta*/)
	{
		Double rad = alpha * Math.PI / 180;
		return Math.pow(side,2)*Math.sin(rad);
	}
	
}
