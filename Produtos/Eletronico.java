package Produtos;
public class Eletronico extends Produto {
    public int garantia;
    
    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    @Override
    public double calcularPrecoComDesconto() {
        return getPreco() * 0.9;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Desconto: " + this.calcularPrecoComDesconto());
        
    }
}

