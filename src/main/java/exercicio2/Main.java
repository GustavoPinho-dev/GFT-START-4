package exercicio2;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Gustavo", "Rua 1", "34999990000");
        Pessoa pessoa2 = new Pessoa("João", "Rua 2", "51999991111");
        Pessoa pessoa3 = new Pessoa("Maria", "Rua 3", "85999992222");
        Pessoa pessoa4 = new Pessoa("Fernando", "Rua 4", "51999993333");
        Pessoa pessoa5 = new Pessoa("Ana", "Rua 5", "51999994444");

        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        System.out.println(pessoa3.toString());
        System.out.println(pessoa4.toString());
        System.out.println(pessoa5.toString());
    }
}
