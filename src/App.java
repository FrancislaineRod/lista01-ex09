import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);

        double fahrenheit = 0.0f,celsius = 0.0f;
        System.out.print("Digite a temperatura em Fahrenheit: ");
        fahrenheit = console.nextDouble();

        celsius= ( fahrenheit-32)*5/9;

        System.out.println("Temperatura em graus celsius "+celsius+"°C");
        console.close();
    }
}
