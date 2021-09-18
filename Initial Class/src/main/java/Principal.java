import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Principal {

    public static void listas(String[] args){
        System.out.println("Criando lista");
        List<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("Joao");

        System.out.println("Retornando lista criada item por item:");
        Iterator<String> iterator = nomes.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Fim da lista");

        System.out.println("Buscando pelo nome Carlos na lista");
        int position = nomes.indexOf("Carlos");
        nomes.set(position, "Roberto");
        System.out.println("Retornando lista pós trocar Carlos em Roberto");
        System.out.println(nomes);

        System.out.println("Retornando primeiro da lista");
        System.out.println(nomes.get(1));
        System.out.println("Retirando o quarto da lista");
        nomes.remove(4);

        System.out.println("Retornando lista");
        System.out.println(nomes);

        System.out.println("Retirando o Joao da lista");
        if(nomes.contains("Joao")){
            System.out.println("A lista contém o nome Joao");
            int position2 = nomes.indexOf("Joao");
            nomes.remove(position2);
        } else {
            System.out.println("A lista não contém o nome Joao");
        }

        System.out.println("Retornando lista");
        System.out.println(nomes);

        System.out.println("A lista atualmente se encontra com o tamanho de: " + nomes.size() + " nomes.");

        System.out.println("Verificando se a lista contém o nome Juliano...");
        if(nomes.contains("Juliano")){
            System.out.println("A lista contém o nome Juliano");
        } else {
            System.out.println("A lista não contém o nome Juliano");
        }

        System.out.println("Criando lista 2");
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Ismael");
        nomes.add("Rodrigo");

        System.out.println("Concatenando listas...");
        nomes.addAll(nomes2);

        System.out.println("Retornando lista nova");
        System.out.println(nomes);

        System.out.println("Retornando lista em ordem alfabetica");
        Collections.sort(nomes);
        System.out.println(nomes);

        if(nomes.isEmpty()){
            System.out.println("A lista está vazia.");
        } else {
            System.out.println("A lista não está vazia.");
        }
    }

    public static void filas(String[] args){
        System.out.println("Criando lista ordenada");
        Queue<String> fila = new LinkedList<>();
        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("Joao");

        System.out.println("Retornando lista ordenada criada item por item:");
        Iterator<String> iterator = fila.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Fim da lista");
        System.out.println("Verificando o primeiro da fila:");
        System.out.println(fila.peek());
        System.out.println("Verificando e retirando o primeiro da fila:");
        System.out.println(fila.poll());

        System.out.println("Adicionando o Daniel na fila ordenada");
        fila.add("Daniel");
        System.out.println("Adicionado como o " + fila.size() + " da fila!");
        System.out.println(fila);
        System.out.println("A fila atualmente possui "+ fila.size() + " nomes.");

        System.out.println("Verificando se a fila está vazia...");
        if(fila.isEmpty()){
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("A fila não está vazia.");
        }
    }

    public static void mapa(String[] args){
        Map<String, String> estadosBrasileiros = new HashMap<>();
        estadosBrasileiros.put("MG", "Minas Gerais");
        estadosBrasileiros.put("BA", "Bahia");
        estadosBrasileiros.put("RJ", "Rio de Janeiro");
        estadosBrasileiros.put("MT", "Mato Grosso");
        estadosBrasileiros.put("GO", "Goias");
        estadosBrasileiros.put("CE", "Ceara");
        estadosBrasileiros.put("RS", "Rio grosso do Sul");
        estadosBrasileiros.put("SP", "Sao Paulo");
        estadosBrasileiros.put("PR", "Parana");
        estadosBrasileiros.put("SC", "Santa Catarina");
        estadosBrasileiros.put("PE", "Pernambuco");
        estadosBrasileiros.put("ES", "Espirito Santo");
        estadosBrasileiros.put("PA", "Para");
        estadosBrasileiros.put("AM", "Amazonas");
        estadosBrasileiros.put("PI", "Piaui");
        estadosBrasileiros.put("MS", "Mato Grosso do Sul");
        estadosBrasileiros.put("SE", "Sergipe");
        estadosBrasileiros.put("MA", "Maranhao");
        estadosBrasileiros.put("RN", "Rio Grande do Norte");
        estadosBrasileiros.put("PB", "Paraiba");
        estadosBrasileiros.put("AL", "Alagoas");
        estadosBrasileiros.put("TO", "Tocatins");
        estadosBrasileiros.put("AC", "Acre");
        estadosBrasileiros.put("RO", "Rondonia");
        estadosBrasileiros.put("RR", "Roraima");
        estadosBrasileiros.put("AP", "Amapa");

        System.out.println("Visualizando estados brasileiros...");
        //System.out.println(estadosBrasileiros);

        System.out.println("Removendo MG e adicionando DF...");
        //estadosBrasileiros.remove("MG");
        estadosBrasileiros.put("DF", "Distrito Federal");
        System.out.println(estadosBrasileiros);

        System.out.println("O mapa de estados Brasileiros possui atualmente " + estadosBrasileiros.size() + " estados.");

        //System.out.println("Removendo MS...");
        //estadosBrasileiros.remove("MS", "Mato Grosso do Sul");

        //System.out.println(estadosBrasileiros);
        //System.out.println("O mapa de estados Brasileiros possui atualmente " + estadosBrasileiros.size() + " estados.");

        Iterator<String> it = estadosBrasileiros.keySet().iterator();
        System.out.println("Visualizando estados...");
        while (it.hasNext()){
            String key = it.next();
            System.out.println(estadosBrasileiros.get(key) + " [" + key + "]");
        }
        System.out.println("Fim do mapa.");

        System.out.println("Verificando existência de Santa Catarina nos estados brasileiros.");
        if(estadosBrasileiros.containsKey("SC")){
            System.out.println("Existe sim!");
        } else {
            System.out.println("Não existe não.");
        }

        System.out.println("Verificando existência de Maranhao nos estados brasileiros.");
        if(estadosBrasileiros.containsValue("Maranhao")){
            System.out.println("Existe sim!");
        } else {
            System.out.println("Não existe não.");
        }
        System.out.println("Fim.");
    }

    public static void stream(String[] args){
        System.out.println("Criando alunos...");
        Students carlos = new Students("Carlos", 18, "Computer Science");
        Students bernardo = new Students("Bernardo", 17, "Computer Science");
        Students jonatas = new Students("Jonatas", 19, "Computer Science");
        Students joana = new Students("Joana", 21, "Arts");
        Students maria = new Students("Maria", 18, "Computer Science");
        Students eugenio = new Students("Eugenio", 21, "Computer Science");
        Students gumercindo = new Students("Gumercindo", 28, "Politics");
        Students dorvalina = new Students("Dorwalina", 28, "Psychology");

        System.out.println("Adicionando alunos...");
        List<Students> estudantes = new ArrayList<>();

        estudantes.add(carlos);
        estudantes.add(bernardo);
        estudantes.add(jonatas);
        estudantes.add(joana);
        estudantes.add(maria);
        estudantes.add(eugenio);
        estudantes.add(gumercindo);
        estudantes.add(dorvalina);

        System.out.println("Temos atualmente cadastrados, " + estudantes.stream().count() + " estudantes");

        System.out.println("Filtrando alunos por maioridade..." + estudantes.stream()
                .filter((estudante) -> estudante.getAge() >= 18 ).collect(Collectors.toList()));

        estudantes.stream().forEach(System.out::println);

        System.out.println("Filtrando alunos por nomes com letra B..." + estudantes.stream()
                .filter((estudante) -> estudante.getName().contains("B")).collect(Collectors.toList()));

        if(estudantes.stream().filter((estudante) -> estudante.getName().contains("w")).collect(Collectors.toList()).size() > 0){
            System.out.println("Existe sim.");
        } else {
            System.out.println("Nem existe ainda.");
        }

        System.out.println("O nosso estudante mais velho é: " + estudantes.stream().max(Comparator.comparingInt(v -> v.getAge())));
        System.out.println("O nosso estudante mais novo é: " + estudantes.stream().min(Comparator.comparingInt(v -> v.getAge())));

    }

    public static void TestePositivos(String[] args) throws IOException {
        List<Float> valores = new ArrayList<>();
        int i = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(i < 7){
            StringTokenizer st = new StringTokenizer(br.readLine());

            float a = Float.parseFloat(st.nextToken());
            valores.add(a);
            i++;
        }

        Iterator<Float> it = valores.iterator();
        int ctr = 0;
        while(it.hasNext()){
            Float key = it.next();
            if(key > 0){
                ctr++;
            }
        }
        String retorno = ctr + " valores positivos.";
        System.out.println(retorno);
    }

    public static void TestePares(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        for (int i = 1; i <=  a; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }

    public static void TesteTipos(String[] args) throws IOException {
        List<Float> valores = new ArrayList<>();
        int i = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(i < 6){
            StringTokenizer st = new StringTokenizer(br.readLine());

            float a = Float.parseFloat(st.nextToken());
            valores.add(a);
            i++;
        }

        Iterator<Float> it = valores.iterator();

        int ctpar = 0;
        int ctimpar = 0;
        int ctpos = 0;
        int ctneg = 0;

        while(it.hasNext()){
            Float key = it.next();
            if(key > 0){
                ctpos++;
            }
            if(key < 0){
                ctneg++;
            }
            if(key % 2 == 0){
                ctpar++;
            }
            if(key % 2 != 0){
                ctimpar++;
            }
        }
        System.out.println(ctpar + " valor(es) par(es)");
        System.out.println(ctimpar + " valor(es) impar(es)");
        System.out.println(ctpos + " valor(es) positivo(s)");
        System.out.println(ctneg+ " valor(es) negativo(s)");
    }

}
