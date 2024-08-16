import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;

public class script {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 12, 19, 7, 3, 15, 22);

        ordenarLista(numeros);

        processarLista(numeros);
    }

    /**
     * Ordena a lista de números em ordem crescente.
     * @param lista a lista de números a ser ordenada
     */
    public static void ordenarLista(List<Integer> lista) {
        Collections.sort(lista);
    }

    /**
     * Filtra, transforma e imprime os números de uma lista.
     *
     * @param lista a lista de números a ser processada
     */
    public static void processarLista(List<Integer> lista) {
        // Predicate: filtrar números maiores que 10
        Predicate<Integer> maiorQueDez = numero -> numero > 10;

        // Function: multiplicar o número por 2
        Function<Integer, Integer> multiplicarPorDois = numero -> numero * 2;

        // Consumer: imprimir o número
        Consumer<Integer> imprimir = numero -> System.out.println("Número: " + numero);

        lista.stream()
                .filter(maiorQueDez)
                .map(multiplicarPorDois)
                .forEach(imprimir);
    }
}