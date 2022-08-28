import java.util.Scanner;

public class AreaCirculo {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            double PI = 3.14159;
            double raio = sc.nextDouble();
            double area = PI * Math.pow(raio, 2);

            System.out.println(String.format("A=%.4f\n", area));
        }
    }
}