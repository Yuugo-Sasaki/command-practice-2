import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("身長を入力してください");
        double sin  = scanner.nextDouble();
        System.out.println("体重を入力してください");
        double tai = scanner.nextDouble();

        double sinm = sin / 100;

        double sin2 = sinm * sinm;
        double result = tai / sin2;

        double lastresult = ((double)Math.round(result * 10))/10;
        
        System.out.println("あなたのBMIは" + lastresult + "です。");
        System.out.println("あなたのBMIは" + lastresult + "です。");
    }
}
//体重÷(身長m^2)