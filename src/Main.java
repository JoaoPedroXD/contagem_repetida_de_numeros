import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Variável que coleta o que foi informado no terminal
        Scanner sc = new Scanner(System.in);

        //Variável que armazena os números informados
        ArrayList<Integer> numbers = new ArrayList<>();

        //Define quantos números existem no terminal
        int qtdValues = sc.nextInt();
        //Realiza uma interação para cada um desses números
        for (int i = 0; i < qtdValues; i++) {
            //Adiciona o número encontrado
            numbers.add(sc.nextInt());
        }

        //Cria um Map, com a relação ["Número", "Quantidade"]
        SortedMap<Integer, Integer> countNumb = new TreeMap<>();
        //Pega os números um a um e faz o procedimento abaixo
        numbers.forEach(num -> {
            //Caso o número exista, adiciona mais um senão, seta como um único número
            countNumb.merge(num, 1, Integer::sum);
        });

        //Ao término, exibe quantas vezes cada número apareceu
        countNumb.forEach((key, value) -> System.out.printf("%d aparece %d vez(es)\n", key, value));

        //Fecha o terminal e encerra o programa
        sc.close();
    }
}
