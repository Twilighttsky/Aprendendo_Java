import java.io.IOException;
 import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner ler = new Scanner(System.in);
    double a, b, c, media;
    a = ler.nextDouble();
    b = ler.nextDouble();
    c = ler.nextDouble();
    media = ((a*2)+(b*3)+(c*5))/10;
    System.out.println(String.format("MEDIA = %.1f", media));
        
 
    }
 
}
