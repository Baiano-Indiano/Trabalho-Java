package Inteiro;
public class InteiroSet {
    
    private boolean[] conjunto;

    // Construtor que inicializa o array de booleanos com tamanho 101 (0 a 100)
    public InteiroSet() {
        conjunto = new boolean[101];
    }

    // Método para realizar a união de dois conjuntos
    public InteiroSet union(InteiroSet outroConjunto) {
        InteiroSet resultado = new InteiroSet();
        for (int i = 0; i < conjunto.length; i++) {
            resultado.conjunto[i] = this.conjunto[i] || outroConjunto.conjunto[i];
        }
        return resultado;
    }

    // Método para realizar a interseção de dois conjuntos
    public InteiroSet intersecao(InteiroSet outroConjunto) {
        InteiroSet resultado = new InteiroSet();
        for (int i = 0; i < conjunto.length; i++) {
            resultado.conjunto[i] = this.conjunto[i] && outroConjunto.conjunto[i];
        }
        return resultado;
    }

    // Método para inserir um elemento no conjunto
    public void insereElemento(int k) {
        if (k >= 0 && k <= 100) {
            conjunto[k] = true;
        }
    }

    // Método para remover um elemento do conjunto
    public void deleteElemento(int m) {
        if (m >= 0 && m <= 100) {
            conjunto[m] = false;
        }
    }

    // Método para converter o conjunto em uma string
    public String toSetString() {
        StringBuilder sb = new StringBuilder();
        boolean vazio = true;
        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i]) {
                sb.append(i).append(" ");
                vazio = false;
            }
        }
        return vazio ? "-" : sb.toString().trim();
    }

    // Método para verificar se dois conjuntos são iguais
    public boolean ehIgualTo(InteiroSet outroConjunto) {
        for (int i = 0; i < conjunto.length; i++) {
            if (this.conjunto[i] != outroConjunto.conjunto[i]) {
                return false;
            }
        }
        return true;
    }
}