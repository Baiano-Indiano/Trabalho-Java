package Produtos;
public class Alimento extends Produto {
    public String dataDeValidade;

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
    @Override
    public double calcularPrecoComDesconto() {
        return getPreco() * 0.9;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Desconto: " + this.calcularPrecoComDesconto());
        System.out.println("Data de validade: " + this.dataDeValidade);
    }
}

