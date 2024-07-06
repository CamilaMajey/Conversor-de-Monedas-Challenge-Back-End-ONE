import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConvertidorMoneda convertidor = new ConvertidorMoneda(); // Crear una instancia del convertidor de monedas
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al Convertidor de Monedas!");

        System.out.print("Ingrese la cantidad: ");
        double cantidad = scanner.nextDouble(); // Leer la cantidad a convertir

        System.out.print("Ingrese la moneda de origen (USD, EUR, COP, GBP, JPY, AUD, CAD, CHF): ");
        Moneda monedaOrigen = new Moneda(scanner.next()); // Leer la moneda de origen

        System.out.print("Ingrese la moneda de destino (USD, EUR, COP, GBP, JPY, AUD, CAD, CHF): ");
        Moneda monedaDestino = new Moneda(scanner.next()); // Leer la moneda de destino

        try {
            // Convertir la cantidad de la moneda de origen a la moneda de destino
            double cantidadConvertida = convertidor.convertir(monedaOrigen, monedaDestino, cantidad);
            System.out.println("Cantidad convertida: " + cantidadConvertida + " " + monedaDestino.getCodigo());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Mostrar mensaje de error si no se encuentra la tasa de conversión
        }
    }
}