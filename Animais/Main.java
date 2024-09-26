package Animais;
public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Max", 5);
        Gato gato = new Gato("Shakas", 3);

        System.out.println(cachorro.getNome() + ": " + cachorro.emitirSom());
        System.out.println(gato.getNome() + ": " + gato.emitirSom());
    }
}