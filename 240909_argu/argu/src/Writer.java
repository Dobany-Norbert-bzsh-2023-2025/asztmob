import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Writer {
    public void writeTodo(String txt, String fileName) throws IOException
    {
        
        FileWriter fw = new FileWriter(fileName+".txt",Charset.forName("utf-8"),true);
        fw.write(txt);
        fw.close();
    }
}
