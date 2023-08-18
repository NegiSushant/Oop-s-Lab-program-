import java.io.FileInputStream;

public class ReadAllCharacter {
    public static void main(String[] args) {
        try{
            FileInputStream fs = new FileInputStream("First");
            int i = 0;

            while ((i = fs.read()) != -1){
                System.out.print((char) i);
            }
            fs.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
