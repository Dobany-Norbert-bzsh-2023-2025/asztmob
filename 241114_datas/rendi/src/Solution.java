import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Solution{
    ArrayList<Integer> numList = new ArrayList<>();
    public void readFile()
    {
        try
        {
            tryReadFile();
        }   
        catch (FileNotFoundException e)
        {
            System.err.println("Error");
            System.err.println(e.getMessage());
        }
    }
    private void tryReadFile() throws FileNotFoundException
    {
        File file = new File("adat_0005000.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            numList.add(Integer.parseInt(line));
        }
        sc.close();
    }

    public void printList(long duration)
    {
        for(Integer num : numList)
        {
            System.out.println(num);
        }
        System.out.println("Duration: " + duration + "ms");
    }

    public void sortList()
    {
        Sorter sorter = new Sorter();
        int n = numList.size();
        //sorter.quicksort(numList, 0, n-1);
        //sorter.bubblesort(numList);
        //numList.sort(null);
    }
}
