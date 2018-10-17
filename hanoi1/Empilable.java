public interface Empilable extends Comparable {

    int taille = 0;

    public int compareTo(Object o);
    public void init(int taille);
}
