package Animais;
class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        setNome(nome);  
        setIdade(idade); 
    }
    
    @Override
    public String emitirSom() {
        return "O cachorro late.";
    }
}