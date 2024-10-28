

public class Operaciones {

    // Método para invertir la cadena de forma recursiva
    public String revertirRecursivo(String texto) {
        if (texto.isEmpty()) {
            return "";
        }
        return revertirRecursivo(texto.substring(1)) + texto.charAt(0);
    }

    // Método para invertir la cadena de forma iterativa
    public String revertirIterativo(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado.append(texto.charAt(i));
        }
        return resultado.toString();
    }
}
