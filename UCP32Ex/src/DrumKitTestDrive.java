public class DrumKitTestDrive {

    public static void main(String[] args) {


        DrumKit d = new DrumKit();
        d.snare = false;
        d.playSnare();
        if (d.snare == false) {

            d.playTopHat();
        }


    }
}
