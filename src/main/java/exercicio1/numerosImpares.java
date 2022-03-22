package exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class numerosImpares {
    public static void main(String[] args) {

        // Declaração de variáveis
        int nInicial = 0;
        int nFinal = 1;
        List<Integer> impares = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        // O número inicial inicia como zero e recebe um novo valor dentro do laço de repetição
        // O laço se encerra apenas quando (inicial > 0)
        while (nInicial <= 0) {
            System.out.print("Informe o numero inicial: ");
            nInicial = sc.nextInt();

            if (nInicial <= 0) {
                System.out.println("O numero inicial deve ser maior que zero!");
            }
        }

        // O número final inicial sendo menor que o inicial e no laço de repetição recebe um novo valor
        // O laço se encerra apenas quando (final > inicial)
        while (nFinal < nInicial) {
            System.out.print("Informe o numero final: ");
            nFinal = sc.nextInt();

            if (nFinal < nInicial) {
                System.out.println("O numero final deve ser maior que o inicial!");
            }
        }

        // Todos os números entre o inicial e o final serão percorridos
        // Caso sejam impar serão adicionados em uma lista que será o resultado final
        for (int i = nInicial; i <= nFinal; i++) {
            if (i % 2 != 0) {
                impares.add(i);
            }
        }

        System.out.println("Números ímpares: " + impares);
    }
}
