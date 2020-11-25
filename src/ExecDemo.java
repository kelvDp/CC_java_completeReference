public class ExecDemo {
    // demonstrate exec()

    public static void main(String[] args) {

        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("notepad");
            p.waitFor();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        assert p != null;
        System.out.println("Notepad returned " + p.exitValue());
    }
}
