package controllers;

import fr.unicaen.magicmonkey.personne.BddPersonne;
import fr.unicaen.magicmonkey.personne.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class FrontController {

    @Autowired
    private BddPersonne bddPersonne;

    @RequestMapping("/")
    public String home() {
        return "Hello World !";
    }

    @RequestMapping(value = "person/{id}", method = RequestMethod.GET)
    public Personne getPersonById(@PathVariable("id") Integer id) {
        return this.bddPersonne.getOneById(id);
    }

    @RequestMapping(value = "persons", method = RequestMethod.GET)
    public ArrayList<Personne> getPersons() {
        return this.bddPersonne.getAll();
    }

    @RequestMapping(value = "person/delete/{id}", method = RequestMethod.DELETE)
    public boolean deletePersonById(@PathVariable("id") Integer id) {
        return this.bddPersonne.deleteOneById(id);
    }

    @RequestMapping(value = "person/add", method = RequestMethod.POST)
    public boolean addOnePerson(@RequestParam("name") String name, @RequestParam("lastName") String lastName) {
        return this.bddPersonne.addOne(name, lastName);
    }


}