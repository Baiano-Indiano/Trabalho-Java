package Animais;
class Gato extends Animal {

    public Gato(String nome, int idade) {
        setNome(nome);  
        setIdade(idade); 
    }
    
    @Override
    public String emitirSom() {
        return "O gato mia.";
    }
}