import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner ler = new Scanner(System.in);
    int a, b, c, d, dif;
    a = ler.nextInt();
    b = ler.nextInt();
    c = ler.nextInt();
    d = ler.nextInt();
    dif = ((a*b)-(c*d));
    System.out.println("DIFERENCA = " + dif);
    
 
    }
 
}
