import java.util.Scanner;

public class UserDefExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        double temp = sc.nextDouble();

        try{
            if(temp < 94.00){
                throw new MyExep("TemperatureBelowNormal");
            } else if (temp > 94.00 && temp < 100.00) {
                throw new MyExep("NormalTemperature");
            } else if (temp >= 100.00) {
                throw new MyExep("TemperatureAboveNormal");
            }
        }catch (MyExep e){
            System.out.println(e);
        }
    }
}

class MyExep extends Exception {
    MyExep(String msg) {
        super(msg);
    }
}
