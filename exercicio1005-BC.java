import java.io.IOException;
 import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner ler = new Scanner(System.in);
    double a, b, media;
    a = ler.nextDouble();
    b = ler.nextDouble();
    media = ((a*3.5)+(b*7.5))/11;
    System.out.println(String.format("MEDIA = %.5f", media));
    
    }
 
}
