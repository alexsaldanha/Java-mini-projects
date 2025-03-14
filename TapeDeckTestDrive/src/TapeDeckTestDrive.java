public class TapeDeckTestDrive {

    public static void main(String[] args) {
        TapeDeck t = new TapeDeck (); //declara novo objeto 't'
        t.canRecord = true;
        t.playTape ();

        if (t.canRecord == true) {  //se canRecord for verdadeiro segue
            t.recordTape ();
        }

    }
}


