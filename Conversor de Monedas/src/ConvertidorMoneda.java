import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Arrays;

public class ConvertidorMoneda {
    private Map<String, Double> tasasCambio; // Mapa para almacenar las tasas de cambio

    // Constructor que inicializa el mapa de tasas de cambio y agrega algunas tasas
    public ConvertidorMoneda() {
        tasasCambio = new HashMap<>();

        // Lista de tasas de cambio
        List<TasaCambio> listaTasas = Arrays.asList(
                new TasaCambio(new Moneda("USD"), new Moneda("EUR"), 0.85),
                new TasaCambio(new Moneda("EUR"), new Moneda("USD"), 1.18),
                new TasaCambio(new Moneda("USD"), new Moneda("COP"), 3800.00),
                new TasaCambio(new Moneda("COP"), new Moneda("USD"), 0.00026),
                new TasaCambio(new Moneda("EUR"), new Moneda("COP"), 4500.00),
                new TasaCambio(new Moneda("COP"), new Moneda("EUR"), 0.00022),
                new TasaCambio(new Moneda("USD"), new Moneda("GBP"), 0.75),
                new TasaCambio(new Moneda("GBP"), new Moneda("USD"), 1.33),
                new TasaCambio(new Moneda("USD"), new Moneda("JPY"), 110.00),
                new TasaCambio(new Moneda("JPY"), new Moneda("USD"), 0.0091),
                new TasaCambio(new Moneda("USD"), new Moneda("AUD"), 1.35),
                new TasaCambio(new Moneda("AUD"), new Moneda("USD"), 0.74),
                new TasaCambio(new Moneda("USD"), new Moneda("CAD"), 1.25),
                new TasaCambio(new Moneda("CAD"), new Moneda("USD"), 0.80),
                new TasaCambio(new Moneda("USD"), new Moneda("CHF"), 0.92),
                new TasaCambio(new Moneda("CHF"), new Moneda("USD"), 1.09)
        );

        // Agregar cada tasa de cambio a tasasCambio
        for (TasaCambio tasa : listaTasas) {
            agregarTasaCambio(tasa);
        }
    }

    // Método para agregar una tasa de cambio al mapa
    private void agregarTasaCambio(TasaCambio tasaCambio) {
        String clave = tasaCambio.getMonedaOrigen().getCodigo() + "_A_" + tasaCambio.getMonedaDestino().getCodigo();
        tasasCambio.put(clave, tasaCambio.getTasa());
    }

    // Método para convertir una cantidad de una moneda a otra utilizando la tasa de cambio almacenada en el mapa
    public double convertir(Moneda monedaOrigen, Moneda monedaDestino, double cantidad) {
        if (monedaOrigen == null || monedaDestino == null) {
            throw new IllegalArgumentException("Las monedas no pueden ser nulas");
        }
        String clave = monedaOrigen.getCodigo() + "_A_" + monedaDestino.getCodigo();
        if (tasasCambio.containsKey(clave)) {
            return cantidad * tasasCambio.get(clave);
        } else {
            throw new IllegalArgumentException("No se encontró la tasa de conversión para " + clave);
        }
    }
}