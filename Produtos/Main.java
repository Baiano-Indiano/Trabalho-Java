package Produtos;
public class Main {
    public static void main(String[] args) {

        Eletronico eletronico = new Eletronico();
        eletronico.setNome("Celular");
        eletronico.setPreco(1250);
        eletronico.calcularPrecoComDesconto();
        eletronico.exibirDetalhes();

        System.out.println();

        Alimento alimento = new Alimento();
        alimento.setNome("arroz");
        alimento.setPreco(100);
        alimento.calcularPrecoComDesconto();
        alimento.setDataDeValidade("20/10/2024");
        alimento.exibirDetalhes();

    }
}