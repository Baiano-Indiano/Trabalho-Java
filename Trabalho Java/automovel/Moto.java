package automovel;

public class Moto extends Veiculo {

    public void exibirDetalhes(){
        System.err.println("");
        System.out.println("Detalhes da Nossa Moto -------");
        System.out.println("Ano: " + this.ano);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Tipo de guidon:" + this.TipoDeGuidon);
        }

        public String TipoDeGuidon;

    public String getTipoDeGuidon() {
        return TipoDeGuidon;
    }

    public void setTipoDeGuidon(String TipoDeGuidon) {
        this.TipoDeGuidon = TipoDeGuidon;
    }
}


