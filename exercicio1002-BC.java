import java.io.IOException;
 import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner ler= new Scanner(System.in);
    double area, n, raio;
    raio=ler.nextDouble();
    n=3.14159;
    area=n*(raio*raio);
    System.out.println(String.format("A=%.4f", area));
    
    }
 
}
