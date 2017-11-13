package fr.unicaen.magicmonkey.personne;

import java.util.ArrayList;

public class BddPersonne implements InterfaceBdd {

    private ArrayList<Personne> personnes;

    public BddPersonne(ArrayList<Personne> personnes) {
        this.personnes = personnes;
    }

    public BddPersonne() {
        this.personnes = new ArrayList<Personne>();
    }

    public ArrayList<Personne> dumpList() {
        this.personnes.add(new Personne("Habit", "Jérémy"));
        this.personnes.add(new Personne("Lainé", "Maxime"));
        this.personnes.add(new Personne("Leménager", "Paul"));
        return this.personnes;
    }

    public ArrayList<Personne> getPersonnes() {
        return personnes;
    }

    public void setPersonnes(ArrayList<Personne> personnes) {
        this.personnes = personnes;
    }
}
