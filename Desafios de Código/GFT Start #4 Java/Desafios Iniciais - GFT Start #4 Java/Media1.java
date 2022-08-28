import java.io.InputStreamReader;
import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(new InputStreamReader(System.in));

        double A = sc.nextDouble();;
        double B = sc.nextDouble();;
        
        double media = (( A * 3.5 +  B * 7.5 )) / 11;

        System.out.printf("MEDIA = %.5f",  media);
        System.out.println();
    }
}