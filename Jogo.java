import java.util.Scanner;
public class Jogo {
    // definindo atributos do jogo
    private Pilha pilha1;
    private Pilha pilha2;
    private Pilha pilha3;
    private Pilha verificadora;
    private Node pop;
    private Node push;
    private int ordenacao;
    private int jogadas;
    // metodo construtor
    public Jogo(Pilha pilha1, Pilha pilha2, Pilha pilha3, Pilha verificadora, int ordenacao) {
        this.pilha1 = pilha1;
        this.pilha2 = pilha2;
        this.pilha3 = pilha3;
        this.verificadora = verificadora;
        this.pop = null;
        this.push = null;
        this.ordenacao = ordenacao;
        this.jogadas = 0;
    }
    // metod para mostrar as 3 pilhas do jogo
    public void mostrarPilhas(){
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Pilha 1: ");
        if(pilha1.getTopo() == -1){
            System.out.println("|   |");
        } else {
            pilha1.imprimir();
        }
        System.out.println("Pilha 2: ");
        if(pilha2.getTopo() == -1){
            System.out.println("|   |");
        } else {
            pilha2.imprimir();
        }
        System.out.println("Pilha 3: ");
        if(pilha3.getTopo() == -1){
            System.out.println("|   |");
        } else {
            pilha3.imprimir();
        }
        System.out.println("\n Jogadas realizadas: " + jogadas);
    }
    // metodo para remover o dado da pilha escolhida
    public Node pop(Scanner scan){
        System.out.println("Digite 1, 2 ou 3 para selecionar a pilha que vai remover o dado: ");
        int resposta = scan.nextInt();
        if(resposta == 1){
            if(pilha1.getTopoDado() != null){
                pop = pilha1.getTopoDado();
                pilha1.remover();
            } else {
                System.out.println("A pilha esta vazia! Pressione qualquer tecla para escolher outra pilha");
                scan.nextLine();
                scan.nextLine();
                pop(scan);
            }
        } else if (resposta == 2){
            if(pilha2.getTopoDado() != null){
                pop = pilha2.getTopoDado();
                pilha2.remover();
            } else {
                System.out.println("A pilha esta vazia! Pressione qualquer tecla para escolher outra pilha");
                scan.nextLine();
                scan.nextLine();
                pop(scan);
            }
        } else if (resposta == 3){
            if(pilha3.getTopoDado() != null){
                pop = pilha3.getTopoDado();
                pilha3.remover();
            } else {
                System.out.println("A pilha esta vazia! Pressione qualquer tecla para escolher outra pilha");
                scan.nextLine();
                scan.nextLine();
                pop(scan);
            }
        } else {
            System.out.println("Resposta invalida! Pressione qualquer tecla para escolher outra pilha");
            scan.nextLine();
            scan.nextLine();
            pop(scan);
        }
        return pop;
    }
    // metodo para inserir o dado na pilha de destino
    public void push(Node pop, Scanner scan){
        push = pop;
        System.out.println("Digite 1, 2 ou 3 para selecionar a pilha que vai receber o dado: ");
        int resposta = scan.nextInt();
        if(resposta == 1){
            int dadoPush = push.getInformacao();
            Node topoAtual = pilha1.getTopoDado();
            if(topoAtual == null){
                pilha1.inserir(dadoPush);
            } else {
                int dadoAtual = topoAtual.getInformacao();
                if(ordenacao == 1){
                    if(dadoPush <= dadoAtual){
                        pilha1.inserir(dadoPush);
                    } else {
                        System.out.println("Voce nao pode inserir esse valor pois ele e maior que o topo atual");
                        System.out.println("Pressione qualquer tecla para continuar");
                        scan.nextLine();
                        scan.nextLine();
                        push(pop, scan);
                    }
                } else {
                    if(dadoPush >= dadoAtual){
                        pilha1.inserir(dadoPush);
                    } else {
                        System.out.println("Voce nao pode inserir esse valor pois ele e maior que o topo atual");
                        System.out.println("Pressione qualquer tecla para continuar");
                        scan.nextLine();
                        scan.nextLine();
                        push(pop, scan);
                    }
                }
            }
        } else if(resposta == 2){
            int dadoPush = push.getInformacao();
            Node topoAtual = pilha2.getTopoDado();
            if(topoAtual == null){
                pilha2.inserir(dadoPush);
            } else {
                int dadoAtual = topoAtual.getInformacao();
                if(ordenacao == 1){
                    if(dadoPush <= dadoAtual){
                        pilha2.inserir(dadoPush);
                    } else {
                        System.out.println("Voce nao pode inserir esse valor pois ele e maior que o topo atual");
                        System.out.println("Pressione qualquer tecla para continuar");
                        scan.nextLine();
                        scan.nextLine();
                        push(pop, scan);
                    }
                } else {
                    if(dadoPush >= dadoAtual){
                        pilha2.inserir(dadoPush);
                    } else {
                        System.out.println("Voce nao pode inserir esse valor pois ele e maior que o topo atual");
                        System.out.println("Pressione qualquer tecla para continuar");
                        scan.nextLine();
                        scan.nextLine();
                        push(pop, scan);
                    }
                }
            }
        } else if(resposta == 3){
            int dadoPush = push.getInformacao();
            Node topoAtual = pilha3.getTopoDado();
            if(topoAtual == null){
                pilha3.inserir(dadoPush);
            } else {
                int dadoAtual = topoAtual.getInformacao();
                if(ordenacao == 1){
                    if(dadoPush <= dadoAtual){
                        pilha3.inserir(dadoPush);
                    } else {
                        System.out.println("Voce nao pode inserir esse valor pois ele e maior que o topo atual");
                        System.out.println("Pressione qualquer tecla para continuar");
                        scan.nextLine();
                        scan.nextLine();
                        push(pop, scan);
                    }
                } else {
                    if(dadoPush >= dadoAtual){
                        pilha3.inserir(dadoPush);
                    } else {
                        System.out.println("Voce nao pode inserir esse valor pois ele e maior que o topo atual");
                        System.out.println("Pressione qualquer tecla para continuar");
                        scan.nextLine();
                        scan.nextLine();
                        push(pop, scan);
                    }
                }
            }
        } else {
            System.out.println("resposte invalida! Pressione quelquer tecla para continuar");
            scan.nextLine();
            scan.nextLine();
            push(pop, scan);
        }
        this.pop = null;
        this.push = null;
    }
    // metodo para movimentar o dado entre as pilhas
    public void movimentar(Scanner scan){
        mostrarPilhas();
        Node aux = pop(scan);
        mostrarPilhas();
        push(aux, scan);
        mostrarPilhas();
        jogadas ++;
    }
    // metodo que verifica condicao de vitoria
    public boolean saoIguais(Pilha pilha1, Pilha pilha2) {
        if (pilha1.getTopo() != pilha2.getTopo()) {
            return false;
        }
        Node noPilha1 = pilha1.getPilha();
        Node noPilha2 = pilha2.getPilha();
        while (noPilha1 != null && noPilha2 != null) {
            if (noPilha1.getInformacao() != noPilha2.getInformacao()) {
                return false;
            }
            noPilha1 = noPilha1.getProximo();
            noPilha2 = noPilha2.getProximo();
        }
        return true;
    }
    // metodos get
    public Pilha getPilha1() {
        return pilha1;
    }
    public Pilha getPilha2() {
        return pilha2;
    }
    public Pilha getPilha3(){
        return pilha3;
    }
}