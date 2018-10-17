public class HanoiNommee extends Hanoi {

    public HanoiNommee(int nb) {
	super();
	depart = new TourNommee(nb, "Depart");
	milieu = new TourNommee(nb, "Milieu");
	arrivee = new TourNommee(nb, "Arrivee");
	try {
	    depart.remplir(nb);
	} catch (ErreurPile e) {}
    }

    // On redefinit l'affichage puisqu'il n'y a pas besoin d'ajouter de texte
    // devant les tours !
    public void affiche() {
	depart.affiche(); milieu.affiche(); arrivee.affiche();
    }


    static public void main (String[] args) {
	HanoiNommee H = new HanoiNommee(6);
	H.jouer();
	System.out.println("Situation finale:"); H.affiche();
    }
}
