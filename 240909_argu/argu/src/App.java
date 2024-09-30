import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Mi legyen a kimeneti file neve?");
        String fileName = scanner.nextLine();

        System.out.println("Mi legyen a szoveg?");
        String text = scanner.nextLine();

        Writer write = new Writer();
        write.writeTodo(text,fileName);     
    } 
}


/*StringBuilder sb = new StringBuilder();
        sb.append("körte");
        System.out.println(sb);

        about();
        
        String szoveg = "asd asd asd";
        System.out.println(szoveg+" "+szoveg.length());
        String szovegReplace = szoveg.replace("asd","dsa");
        //szoveg = szoveg.replace("asd","dsa");
        //szoveg = szoveg + "asd"
        System.out.println(szovegReplace+" "+szovegReplace.length());

        String nevek = "nev1 nev2 nev3";
        String[] nevekTomb = nevek.split(" ");
        for (String a : nevekTomb) {
            System.out.print(a+" ");
        }

        System.out.println();

        String a = "alma";
        String b = "alma";
        Boolean c = a.equals(b);
        System.out.println(a.compareTo(b));

        //Triangle tri = new Triangle();
        double area = Triangle.calcArea(30,35);

         if (args.length > 0) {
            System.out.println(args[0]);
        }
        else
        {
            System.out.println("Nem adtal meg parametert!!");
        }

    }

    private static void about()
    {
        System.out.println("asd");
        System.out.println("dsa");
    }

    private static double calcArea(double base, double height)
    {
        return base * height/2;
    }*/
