public class App {
    public static void main(String[] args) throws Exception {
        Solution s = new Solution();
        s.readFile();
        long startTime = System.currentTimeMillis();
        s.sortList();
        long endTime = System.currentTimeMillis();

        s.printList(endTime - startTime);
    }
}
