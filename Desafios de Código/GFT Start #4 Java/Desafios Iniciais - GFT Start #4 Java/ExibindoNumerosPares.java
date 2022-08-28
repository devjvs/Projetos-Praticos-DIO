import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExibindoNumerosPares {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String entrada = br.readLine();

        for(int i = 0; i <= Integer.parseInt(entrada); i++){

            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}