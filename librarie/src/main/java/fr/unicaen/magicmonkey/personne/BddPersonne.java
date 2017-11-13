package fr.unicaen.magicmonkey.personne;

import java.util.ArrayList;

public class BddPersonne implements InterfaceBdd {

    private ArrayList<Personne> personnes;

    private Integer uniqID = 0;

    public Integer getUniqID(){
        this.uniqID++;
        return this.uniqID;
    }

    public BddPersonne(ArrayList<Personne> personnes) {
        this.personnes = personnes;
    }

    public BddPersonne() {
        this.personnes = new ArrayList<Personne>();
        this.personnes.add(new Personne(this.getUniqID(),"Habit", "Jérémy"));
        this.personnes.add(new Personne(this.getUniqID(),"Lainé", "Maxime"));
        this.personnes.add(new Personne(this.getUniqID(),"Leménager", "Paul"));
    }


    /* PUBLIC FUNCTIONS */

    public ArrayList<Personne> getAll() {
        return this.personnes;
    }

    public Personne getOneById(Integer id) {
        for (Personne personne : this.personnes) {
            if (personne.getId().equals(id)) {
                return personne;
            }
        }
        return null;
    }

    public boolean deleteOneById(Integer id) {
        for (Personne personne : this.personnes) {
            if (personne.getId().equals(id)) {
                this.personnes.remove(personne);
                return true;
            }
        }
        return true;
    }

    public boolean addOne(String name, String lastName) {
        this.personnes.add(new Personne(this.getUniqID(), name, lastName));
        return true;
    }


    /* GETTERS & SETTERS */

    public ArrayList<Personne> getPersonnes() {
        return personnes;
    }

    public void setPersonnes(ArrayList<Personne> personnes) {
        this.personnes = personnes;
    }
}
