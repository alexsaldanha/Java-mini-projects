public class Garrafas99 {

    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {

            if (beerNum == 1) {
                word  = "bottle" ; // no singular, como em UMA garrafa.
            }

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down·");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;


            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            } //fim do else
        } //fim do loop while
    } //fim do metodo main
} //fim da classe

