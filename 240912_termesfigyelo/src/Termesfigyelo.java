import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Termesfigyelo {
    Integer db = 0;
    Integer buzaTerm = 0;
    public void readFile() throws FileNotFoundException
    {
        List<Termes> termesList = new ArrayList<>();
        File file = new File("termes.txt");
        Scanner sc = new Scanner(file);
        sc.nextLine();
        while (sc.hasNextLine()) 
        {
            String[] line = sc.nextLine().split(":");
            Termes t = new Termes();
            t.id = Integer.parseInt(line[0]);
            t.nev = line[1];
            t.dunlo = line[2];
            t.termes = Integer.parseInt(line[3]);
            t.betakaritas = Date.valueOf(line[4]);
            termesList.add(t);
        }

        termesList.forEach((n) -> 
        {
            if (n.dunlo=="Búza") 
            {
                buzaTerm += n.termes;
                db++;
            }
        });
        System.out.println("Búza db: " + db);
        System.out.println("Búza mázsa: " + buzaTerm);
    }
}
