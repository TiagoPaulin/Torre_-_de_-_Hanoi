public class Pilha {
    private int topo;
    private Node pilha;
    private Node topoDado;
    private int capacidade;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.topo = -1;
        this.pilha = null;
        this.topoDado = null;
    }

    public boolean vazio(){
        if(topo == -1){
            return true;
        } else {
            return false;
        }
    }

    public boolean cheio(){
        if(topo == (capacidade - 1)){
            return true;
        } else {
            return false;
        }
    }

    public void inserir(int dado){
        Node no = new Node();
        no.setInformacao(dado);
        if(vazio()){
            topoDado = no;
            pilha = topoDado;
            topo ++;
        } else if((!vazio()) && (!cheio())){
            no.setProximo(topoDado);
            topoDado = no;
            pilha = topoDado;
            topo ++;
        } else {
            System.out.println("A pilha ja atingiu a capacidade maxima");
        }
    }

    public void imprimir(){
        Node atual = pilha; // criar o atual pra nao anular minha pilha
        int varrer = 0;
        System.out.println("Topo: " + topo);
        while(varrer <= topo){
            if(atual.getInformacao() != -1) {
                System.out.println(" | " + atual.getInformacao() + " | ");
            }
            atual = atual.getProximo();
            varrer ++;
        }
    }

    public void remover(){
        if(vazio()){
            System.out.println("Pilha vazia");
        } else {
            topoDado = topoDado.getProximo();
            pilha = topoDado;
            topo --;
        }
    }

    public void ordenarCrescente(){
        int nElementos = (topo + 1);
        int contador = 0;
        while (contador < nElementos) {
            Node atual = pilha;
            Node proximo = pilha.getProximo();
            for (int i = 0; i < (nElementos - 1); i++) {
                if (atual != null && proximo != null) {
                    Integer menor = atual.getInformacao();
                    Integer maior = proximo.getInformacao();
                    if (menor > maior) {
                        // Troca os elementos
                        atual.setInformacao(maior);
                        proximo.setInformacao(menor);
                    }
                    atual = proximo;
                    proximo = proximo.getProximo();
                }
            }
            contador++;
        }
    }

    public void ordenarDecrescente(){
        int nElementos = (topo + 1);
        int contador = 0;
        while (contador < nElementos) {
            Node atual = pilha;
            Node proximo = pilha.getProximo();
            for (int i = 0; i < (nElementos - 1); i++) {
                if (atual != null && proximo != null) {
                    Integer menor = atual.getInformacao();
                    Integer maior = proximo.getInformacao();
                    if (maior > menor) {
                        // Troca os elementos
                        atual.setInformacao(maior);
                        proximo.setInformacao(menor);
                    }
                    atual = proximo;
                    proximo = proximo.getProximo();
                }
            }
            contador++;
        }
    }

    public Node getTopoDado() {
        return topoDado;
    }

    public Node getPilha() {
        return pilha;
    }

    public int getTopo() {
        return topo;
    }
}
