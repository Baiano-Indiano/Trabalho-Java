package Faturas;
public class FaturaTeste {
    
    public static void main(String[] args) {

        System.out.println("Teste");
        Fatura faturinha = new Fatura();

        faturinha.setCodigoProduto("123123");     
        faturinha.setDescricaoProduto("Mouse GUEYMER");     
        faturinha.setQuantidadeComprada(2);   
        faturinha.setPrecoPorItem(-150); 

        System.out.println("Analise do Produto: ");
        System.out.println("Codigo: " + faturinha.getCodigoProduto());
        System.out.println("Descricao: " + faturinha.getDescricaoProduto());
        System.out.println("Quantidade: " + faturinha.getQuantidadeComprada());
        System.out.println("Preço por Item: " + faturinha.getPrecoPorItem());

        System.out.println("Total da Fatura: " + faturinha.getTotalFatura());
    }


}