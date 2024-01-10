public class Node {
    // definindo atributos
    private Integer Informacao;
    private Node proximo;
    private Node anterior;
    // metodo contrutor
    public Node() {
        Informacao = null;
        this.proximo = null;
        this.anterior = null;
    }
    // metodos get
    public Integer getInformacao() {
        return Informacao;
    }
    public Node getProximo() {
        return proximo;
    }
    public Node getAnterior() {
        return anterior;
    }
    // metodos set
    public void setInformacao(Integer informacao) {
        Informacao = informacao;
    }
    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }
}
