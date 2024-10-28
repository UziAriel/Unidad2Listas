
public class Principal {
    public static void main(String[] args) {
        Operaciones transformador = new Operaciones();
        String textoOriginal = "Uzi Ariel";

        // Imprimir la cadena ingresada y las cadenas invertidas
        System.out.println("Texto invertido recursivamente: " + transformador.revertirRecursivo(textoOriginal));
        System.out.println("Texto invertido iterativamente: " + transformador.revertirIterativo(textoOriginal));
    }
}
