public class Node {
    private Integer Informacao;
    private Node proximo;
    private Node anterior;

    public Node() {
        Informacao = null;
        this.proximo = null;
        this.anterior = null;
    }

    public Integer getInformacao() {
        return Informacao;
    }

    public void setInformacao(Integer informacao) {
        Informacao = informacao;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    public Node getAnterior() {
        return anterior;
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }
}
