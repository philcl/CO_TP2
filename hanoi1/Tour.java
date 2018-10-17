public class Tour extends Pile {
    
    public Tour(int capa) {
	super(capa);
    }

    // la version ici est specialisee dans le sens qu'elle n'empile que
    // des instances de la classe Disque, alors qu'on pourrait en fait
    // empiler des objets arbitraires du moment qu'ils sont comparables.
    // Comme on sait quelle classe il faut instancier, on a juste besoin de
    // prendre en parametre le nombre de disques a empiler, et on commencera
    // par empiler le plus gros.
    public void remplir(int nb) throws ErreurPile {
	for(; nb > 0; nb--) 
	    this.empiler(new Disque(nb));
    }

    // Redéfinir empiler de Pile de façon à contrôler qu'on n'empile
    // qu'une instance de Disque, et de taille suffisamment grande.
    public void empiler(Object v) throws ErreurPile {
        // A FAIRE
        throw new UnsupportedOperationException();
    }
}
