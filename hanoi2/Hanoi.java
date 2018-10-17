public class Hanoi {

    protected Tour depart, milieu, arrivee;

    // le conctructeur prend maintenant en parametre la classe qui doit
    // etre utilisee comme type de disques a empiler.
    public Hanoi(int nb, Class c) {
	depart = new Tour(nb); milieu = new Tour(nb); arrivee = new Tour(nb);
	/* A FAIRE: initialiser la tour de depart avec nb instances de la
	 * classe référencée par le parametre c.
	 */
        throw new UnsupportedOperationException();
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
	    /* On ne peut pas etre plus precis que Empilable puisqu'on ne
	     * connait pas la classe reelle des disques.
	     */
	    Empilable o = (Empilable) D.sommet();
	    D.depiler();
	    A.empiler(o);
	    oneStep(nb-1, M, A, D);
	}
    }
}
