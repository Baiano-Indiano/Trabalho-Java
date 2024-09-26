package Inteiro;

public class InteiroSetTeste {
    public static void main(String[] args) {
        // Criação de dois conjuntos
        InteiroSet conjunto1 = new InteiroSet();
        InteiroSet conjunto2 = new InteiroSet();

        // Inserção de elementos no conjunto1
        conjunto1.insereElemento(10);
        conjunto1.insereElemento(20);
        conjunto1.insereElemento(30);
        
        // Inserção de elementos no conjunto2
        conjunto2.insereElemento(20);
        conjunto2.insereElemento(40);
        conjunto2.insereElemento(50);

        // Exibindo os dois conjuntos
        System.out.println("Conjunto 1: " + conjunto1.toSetString()); // Saída esperada: 10 20 30
        System.out.println("Conjunto 2: " + conjunto2.toSetString()); // Saída esperada: 20 40 50

        // Realizando a união dos dois conjuntos
        InteiroSet uniao = conjunto1.union(conjunto2);
        System.out.println("União: " + uniao.toSetString()); // Saída esperada: 10 20 30 40 50

        // Realizando a interseção dos dois conjuntos
        InteiroSet intersecao = conjunto1.intersecao(conjunto2);
        System.out.println("Interseção: " + intersecao.toSetString()); // Saída esperada: 20

        // Comparando igualdade entre conjunto1 e conjunto2
        boolean saoIguais = conjunto1.ehIgualTo(conjunto2);
        System.out.println("Conjunto 1 e Conjunto 2 são iguais? " + saoIguais); // Saída esperada: false

        // Inserindo os mesmos elementos no conjunto2 para torná-los iguais
        conjunto2.insereElemento(10);
        conjunto2.insereElemento(30);

        // Comparando novamente igualdade entre conjunto1 e conjunto2
        saoIguais = conjunto1.ehIgualTo(conjunto2);
        System.out.println("Conjunto 1 e Conjunto 2 são iguais? " + saoIguais); // Saída esperada: true
    }
}