package kaarten;

/**Representation of playing cards with a suite and value
 *
 * <b>usage</b>
 * <br/>you can create playing cards as follows
 * <br/>Kaart k = new Kaart(KaartWaarde.AAS, Suite.SCHOPPEN)
 *
 * @author David Van Steertegem
 * @version 1.0.0
 * */
public class Kaart {
    private KaartWaarde kaartWaarde;
    private Suite kleur;


    public Kaart(KaartWaarde kaartWaarde, Suite kleur) {
        this.kaartWaarde = kaartWaarde;
        this.kleur = kleur;
    }

    /**
     * @return  the numerical value of the card, for example 13 for a king*/
    public KaartWaarde getKaartWaarde() {
        return kaartWaarde;
    }

    public Suite getKleur() {
        return kleur;
    }

    @Override
    public String toString() {
        return this.kleur + " " + this.kaartWaarde;
    }
}
