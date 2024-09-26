package automovel;
public class Main {
    
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Nissan");
        carro.setModelo("GTR r35");
        carro.setNumeroDePortas(2);
        carro.setAno(2021);
        carro.exibirDetalhes();

        Moto moto = new Moto();
        moto.setMarca("Honda");
        moto.setModelo("Pop 110i");
        moto.setAno(2007);
        moto.setTipoDeGuidon("Barra V");
        moto.exibirDetalhes();
    }

}