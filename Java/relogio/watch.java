package Java.relogio;

import javax.sound.midi.Track;

public class watch {
    public static void main(String[] args) {
        hours thread = new hours();
        Thread t1 = new Thread(thread);
        t1.start();
    }
}
