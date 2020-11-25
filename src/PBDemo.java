public class PBDemo {
    // process builder demo
    public static void main(String[] args) {

        try { // second param is the name of the file
            ProcessBuilder proc = new ProcessBuilder("notepad.exe", "testFile");
            proc.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
