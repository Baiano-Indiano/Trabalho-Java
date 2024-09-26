package Sistema;

public class Funcionario {
    String nome;
    double salarioBase;


    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(){
        return salarioBase;
    }

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Bernardo Santos", 5000, 1500);

        Assistente assistente = new Assistente("Robertinho", 3000);

        System.out.println("Salario do Gerente: " + gerente.getNome() + ": " + gerente.calcularSalario());
        System.out.println("Salario do Assistente: " + assistente.getNome() + ": " + assistente.calcularSalario());
    }
}
