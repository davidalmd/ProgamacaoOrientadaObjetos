import java.beans.ExceptionListener;

import javax.sound.midi.*;

public class MusicTest1 {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("We got a sequencer");
        }
        catch(MidiUnavailableException e) {
            System.out.println("Bummer");
            e.printStackTrace();
            e.getMessage();
        }
    }
    
    // Aqui mostra que executa o finally mesmo que tenha um return no try ou catch, executando o finally antes do retorno
    public static String soma(int a, int b) {
        try {
            return "Executou o try, a soma é " + (a+b);
        }
        catch (ExceptionInInitializerError | Exception e ) {
            return "Executou o try, a soma é " + (a+b);
        }
        finally {
            System.out.println("Executou o finally");
        }
    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
        System.out.println(soma(2,2));
    }
}
