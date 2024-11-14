import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> szotar = new HashMap<>();
        szotar.put("kutya", "dog");
        szotar.put("macska", "cat");
        szotar.put("egér", "mouse");
        szotar.put("ló", "horse");

        System.out.println(szotar.containsKey("kutya"));
        System.out.println(szotar.containsValue("dog"));
    }
}
