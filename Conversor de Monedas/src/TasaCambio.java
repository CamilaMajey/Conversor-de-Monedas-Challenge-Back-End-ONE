public class TasaCambio {
    private Moneda monedaOrigen; // Moneda de origen
    private Moneda monedaDestino; // Moneda de destino
    private double tasa; // Tasa de cambio entre las dos monedas

    // Constructor que inicializa las monedas y la tasa de cambio, validando que las monedas no sean nulas
    public TasaCambio(Moneda monedaOrigen, Moneda monedaDestino, double tasa) {
        if (monedaOrigen == null || monedaDestino == null) {
            throw new IllegalArgumentException("Las monedas no pueden ser nulas");
        }
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.tasa = tasa;
    }

    // Métodos para obtener la moneda de origen, la moneda de destino y la tasa de cambio
    public Moneda getMonedaOrigen() {
        return monedaOrigen;
    }

    public Moneda getMonedaDestino() {
        return monedaDestino;
    }

    public double getTasa() {
        return tasa;
    }
}