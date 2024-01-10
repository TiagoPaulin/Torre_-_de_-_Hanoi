public class Pilha {
    // definindo atributos da pilha
    private int topo;
    private Node pilha;
    private Node topoDado;
    private int capacidade;
    // metodo construtor
    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.topo = -1;
        this.pilha = null;
        this.topoDado = null;
    }
    // metodods auxiliares para verificar se a pilha esta cheia ou vazia
    private boolean vazio(){
        if(topo == -1){
            return true;
        } else {
            return false;
        }
    }
    private boolean cheio(){
        if(topo == (capacidade - 1)){
            return true;
        } else {
            return false;
        }
    }
    //metodo para inserir dados na pilha
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
    // metodo para imprimir a pilha
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
    // metodo para remover elementos da pilha
    public void remover(){
        if(vazio()){
            System.out.println("Pilha vazia");
        } else {
            topoDado = topoDado.getProximo();
            pilha = topoDado;
            topo --;
        }
    }
    // metodo para ordenar os elementos da pilha de forma crescente
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
    // metodo para ordenara a pilha de forma decrescente
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
    // metodos get
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
