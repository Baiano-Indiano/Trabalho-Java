package Sistema;

class Assistente extends Funcionario {

    public Assistente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    
    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }

}
