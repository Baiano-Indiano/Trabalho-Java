package automovel;
public class Carro extends Veiculo{

    
    public void exibirDetalhes(){
        System.out.println("Detalhes do nosso carro -------");
        System.out.println("Ano: " + this.ano);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Numero de portas:" + this.NumeroDePortas);
        }
        
    public int NumeroDePortas;

    public int getNumeroDePortas() {
        return NumeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.NumeroDePortas = numeroDePortas;
    }
}