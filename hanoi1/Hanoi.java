public class Hanoi {

    protected Tour depart, milieu, arrivee;

    // Utile uniquement pour les sous-classes qui donneront leurs
    // propres versions des Tours.
    protected Hanoi() {
    }

    public Hanoi(int nb) {
	// Cree une insatnce des tours de Hanoi avec le bon nombre de
	// disques empiles sur la tour de départ.
	depart = new Tour(nb); milieu = new Tour(nb); arrivee = new Tour(nb);
	try {
	    depart.remplir(nb);
	} catch (ErreurPile e) {}
    }

    public void jouer() {
	try {
	    oneStep(depart.capacite(), depart, arrivee, milieu);
	} catch (ErreurTour e) {
	    System.out.println("Erreur de manipulation des Tours: "
			       + e.getMessage());
	} catch (ErreurPile e) {
	    System.out.println("Erreur de manipulation des Piles: "
			       + e.getMessage());
	}
    }

    public void affiche() {
	System.out.println("Depart:"); depart.affiche();
	System.out.println("Milieu:"); milieu.affiche();
	System.out.println("Arrivee:"); arrivee.affiche();
    }

    // Empiler nb Disque de D vers A en se servant de M comme Tour auxiliaire
    protected void oneStep(int nb, Tour D, Tour A, Tour M) throws ErreurPile {
	if (nb > 0) {
	    oneStep(nb-1, D, M, A);
	    Disque d = (Disque) D.sommet();
	    D.depiler();
	    A.empiler(d);
	    oneStep(nb-1, M, A, D);
	}
    }

    static public void main (String[] args) {
	Hanoi H = new Hanoi(6);
	H.affiche();
	H.jouer();
	System.out.println("Situation finale:"); H.affiche();
    }
}
