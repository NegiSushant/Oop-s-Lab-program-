import java.io.FileOutputStream;

public class WriteStringFile {
    public static void main(String[] args) {
        try{
            FileOutputStream fb = new FileOutputStream("First");
            String s = "Welcome to KIET MCA";

            byte b[] = s.getBytes();

            fb.write(b);
            fb.close();
            System.out.println("Success");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
