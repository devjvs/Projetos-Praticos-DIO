import java.util.Scanner;

public class VisitaFeira {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int total = A + B;

            System.out.println("X = " + total);
        }
    }
}