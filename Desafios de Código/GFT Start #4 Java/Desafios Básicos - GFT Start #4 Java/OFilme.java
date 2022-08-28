import java.io.IOException;
import java.util.Scanner;

public class OFilme {
    
    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double aumento = ((B - A) / A) * 100;
        System.out.printf("%.2f%%\n" + aumento);
        sc.close();
    }
}