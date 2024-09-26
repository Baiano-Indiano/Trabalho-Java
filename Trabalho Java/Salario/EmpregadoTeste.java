package Salario;

public class EmpregadoTeste {
    
    public static void main(String[] args) {
        Empregado empregadinho = new Empregado("Bernardo","Santos", 1235.00);
        Empregado empregadao = new Empregado("Renan", "Pinto", 1250.70);
        
        System.out.println("Salario Anual de: " + empregadinho.getNome() + " " + empregadinho.getSobrenome() + ": " + empregadinho.getSalarioMensal());
        System.out.println("Salario Anual de: " + empregadao.getNome() + " " + empregadao.getSobrenome() + ": " + empregadao.getSalarioMensal());
        System.out.println("\n Novo Salario: ");
        System.out.println("Salario Atualizado de: " + empregadinho.getNome() + " " + empregadinho.getSobrenome() + ": " + empregadinho.calSalarioTotalComAumento());
        System.out.println("Salario Atualizado de: " + empregadao.getNome() + " " + empregadao.getSobrenome() + ": " + empregadao.calSalarioTotalComAumento());
    }
}
