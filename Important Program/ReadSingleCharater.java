import java.io.FileInputStream;

public class ReadSingleCharater {
    public static void main(String[] args) {
        try{
            FileInputStream fi = new FileInputStream("First");
            int i = fi.read();
            System.out.println((char) i);
            fi.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
