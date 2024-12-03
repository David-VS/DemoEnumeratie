import kaarten.Kaart;
import kaarten.KaartWaarde;
import kaarten.Suite;
import statuscodes.StatusCode;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String tekst = "Dit is tekst";
        StatusCode code = StatusCode.SUCCES;

        System.out.println(code.getError());
        System.out.println(Arrays.toString(StatusCode.values()));

        Kaart k = new Kaart(KaartWaarde.AAS, Suite.SCHOPPEN);
        System.out.println(k);

        Kaart[] kaarten = new Kaart[52];
        int index = 0;

        Suite[] kleuren = Suite.values();
        for(int i = 0; i < kleuren.length ; i++){
            for(KaartWaarde kw : KaartWaarde.values()){
                Kaart tijdelijkeKaart = new Kaart(kw, kleuren[i]);
                kaarten[index] = tijdelijkeKaart;
                index++;
            }
        }
        System.out.println(Arrays.toString(kaarten));
    }
}