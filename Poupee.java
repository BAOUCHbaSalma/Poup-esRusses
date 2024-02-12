interface Poupee {

    String Taille = null;
    boolean Ouverte =false;

   abstract public void ouvrir();
    abstract public void fermer();

    abstract public void placerDans(Poupee p);
    abstract public void sortirDe(Poupee p);
}
