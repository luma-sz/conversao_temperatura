import java.text.DecimalFormat;
import java.util.Scanner;

public class temperatura
{

     public static void main(String[] args) {
        double c,f;
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.0");
        System.out.println("Conversão de temperatura");
        System.out.print("Digite a temperatura em fahrenheit: ");
        f = teclado.nextDouble();
        c = (5 * (f-32)) / 9;
        System.out.println("temperatura em celsius: " + formatador.format(c) + "°C");
        teclado.close();
        }
}              

