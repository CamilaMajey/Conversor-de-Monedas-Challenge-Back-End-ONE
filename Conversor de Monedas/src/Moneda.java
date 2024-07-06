public class Moneda {
    private String codigo; // Código de la moneda (ej. USD, EUR)

    // Constructor que inicializa el código de la moneda y valida que no sea nulo o vacío
    public Moneda(String codigo) {
        if (codigo == null || codigo.isEmpty()) {
            throw new IllegalArgumentException("El código de la moneda no puede ser nulo o vacío");
        }
        this.codigo = codigo.toUpperCase(); // Convierte el código a mayúsculas
    }

    // Método para obtener el código de la moneda
    public String getCodigo() {
        return codigo;
    }
}