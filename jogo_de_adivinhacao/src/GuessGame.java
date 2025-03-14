public class GuessGame {

    Player p1;  //tres variaveis de instancia pros tres jogadores
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();  //cria tres objetos Player e atribui a eles as tres variaveis criadas anteriormente
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0; //declara tres variaveis pra armazenar os palpites dos jogadores
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false; //declara tres variaveis pra armazenar (falso ou verdadeiro)  baseado na resposta do jogador
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random()* 10); //cria um numero alvo que os jogadores terao que advinhar
        System.out.println("Estou pensando em um numero entre 0 e 9...");

        while (true) {
            System.out.println("O numero a adivinhar eh: "+ targetNumber);
            p1.guess(); //chama o metodo guess de cada jogador
            p2.guess();
            p3.guess();

            guessp1 = p1.number; //obtem o palpite de cada jogador
            System.out.println("O jogado 'UM' forneceu o palpite " + guessp1);
            guessp2 = p2.number;
            System.out.println("O jogado 'DOIS' forneceu o palpite " + guessp2);
            guessp3 = p3.number;
            System.out.println("O jogado 'TRES' forneceu o palpite " + guessp3);

            if (guessp1 == targetNumber){
                p1isRight = true; //verifica opalpite de cada jogador pra ver se bate com o resultado
            }
            if (guessp2 == targetNumber){
                p2isRight = true;
            }
            if (guessp3 == targetNumber){
                p3isRight = true;
            }

            if (p1isRight | p2isRight | p3isRight){ //se alguem jogador acertar mostra as msg conforme abaixo
                System.out.println("Temos um ganhador!");
                System.out.println("O jogador UM acertou?  " + p1isRight);
                System.out.println("O jogador DOIS acertou?  " + p2isRight);
                System.out.println("O jogador TREIS acertou?  " + p3isRight);
                System.out.println("FIM do JOGO!!!");
                break; //fim do jogo, portanto saia do loop
            } else {
                System.out.println("Os jogadores terao que tentar novamente"); //devemos continuar porque ninguem acertou!
            }//fim do if/else
        }//fim do loop
    }//fim do metodo
}//fim da classe
