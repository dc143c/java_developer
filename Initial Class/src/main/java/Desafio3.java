import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Desafio3 {
    public static void Ordenacao(String[] args) throws IOException {
        List<Integer> ordenados = new ArrayList<>();
        List<Integer> ordenadosDesc = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> valores = br.lines().map(line -> Integer.parseInt(line)).collect(Collectors.toList());

        ordenados = valores.stream().skip(1).filter(val -> val % 2 == 0).collect(Collectors.toList());
        Collections.sort(ordenados);

        ordenadosDesc = valores.stream().skip(1).filter(val -> val % 2 != 0).collect(Collectors.toList());
        Collections.sort(ordenadosDesc);
        Collections.reverse(ordenadosDesc);
        ordenados.addAll(ordenadosDesc);

        ordenados.stream().forEach(System.out::println);
    }

    public static void OrdenarUnicosString(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> itens = br.lines().collect(Collectors.toList());

        List<String> listas = itens.stream().skip(1).collect(Collectors.toList());

        listas.stream().forEach(i -> {
            Set<String> nomes = Arrays.stream(i.split(" ")).distinct().collect(Collectors.toSet());
            System.out.println(nomes.stream().sorted().collect(Collectors.joining(" ")));
        });
    }

}
