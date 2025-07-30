public class ConversorTemperatura {
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
public class ConversorMoeda {
    public static double realParaDolar(double reais) {
        return reais / 5.20; // valor fictício
    }
    public static double dolarParaReal(double dolares) {
        return dolares * 5.20;
    }
}
import java.util.Scanner;
public class Conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1- Temperatura | 2- Moeda");
        int escolha = sc.nextInt();
      
        if (escolha == 1) {
            System.out.println("1- Celsius <> Fahrenheit | 2- Fahrenheit <> Celsius");
            int tipo = sc.nextInt();
            System.out.print("Digite a temperatura: ");
            double valor = sc.nextDouble();

            if (tipo == 1)
                System.out.println("Resultado: " + ConversorTemperatura.celsiusParaFahrenheit(valor));
            else
                System.out.println("Resultado: " + ConversorTemperatura.fahrenheitParaCelsius(valor));
        } else {
            System.out.println("1- Real → Dólar | 2 - Dólar → Real");
            int tipo = sc.nextInt();
            System.out.print("Informe o valor: ");
            double valor = sc.nextDouble();
            if (tipo == 1)
                System.out.println("Resultado: $" + ConversorMoeda.realParaDolar(valor));
            else
                System.out.println("Resultado: R$" + ConversorMoeda.dolarParaReal(valor));
        }
        sc.close();
    }
}
