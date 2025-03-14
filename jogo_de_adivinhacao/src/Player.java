public class Player {
    int number = 0; //onde entra o palpite

    public void guess () {
        number = (int) (Math.random()* 10); //gera um numero aleatorio do palpite pro jogador
        System.out.println("Estou pensando em " + number); //printa o numero pro jogador jogar


    }

}
