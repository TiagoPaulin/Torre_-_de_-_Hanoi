import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Entre com o tamanho das pilhas: ");
        int capacidade = scan.nextInt();
        System.out.println("Entre com 1 para crescente e 0 para decrescente: ");
        int ordenacao = scan.nextInt();
        Pilha verificadora = new Pilha(capacidade);
        Pilha pilha1 = new Pilha(capacidade);
        Pilha pilha2 = new Pilha(capacidade);
        Pilha pilha3 = new Pilha(capacidade);

        for(int i = 0; i < capacidade; i ++){
            int dado = (random.nextInt(100) + 1);
            pilha1.inserir(dado);
            verificadora.inserir(dado);
        }

        Jogo jogo = new Jogo(pilha1, pilha2, pilha3, verificadora, ordenacao);

        if(ordenacao == 1){
            verificadora.ordenarCrescente();
        } else {
            verificadora.ordenarDecrescente();
        }

        while (true){
            jogo.mostrarPilhas();
            System.out.println("Qual ação deseja realizar?");
            System.out.println("1. Movimentar elemento");
            if(capacidade == 3){
                System.out.println("2. Solucao automatica");
            }
            System.out.println("0. Sair do jogo");
            int acao = scan.nextInt();
            switch (acao){
                case 1 :
                    jogo.movimentar(scan);
                    break;
                case 2:
                    jogo.solucaoAutomatica();
                    break;
                case 0:
                    break;
            }
            if(acao == 0){
                scan.close();
                break;
            }
            if(jogo.saoIguais(verificadora, jogo.getPilha1()) || jogo.saoIguais(verificadora, jogo.getPilha2()) || jogo.saoIguais(verificadora, jogo.getPilha3())){
                scan.close();
                break;
            }
        }

    }

}