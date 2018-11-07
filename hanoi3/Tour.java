// La classe Tour est elle-meme generique et sous-classe de Pile 
public class Tour<T extends Empilable<T>> extends Pile<T> {
    
    public Tour(int capa) {
	super(capa);
    }
}
