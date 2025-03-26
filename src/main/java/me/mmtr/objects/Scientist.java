package me.mmtr.objects;

import me.mmtr.interfaces.Animal;
import me.mmtr.interfaces.Person;

import java.util.ArrayList;
import java.util.List;

public class Scientist implements Person {

    private final List<Animal> ownedAnimals = new ArrayList<>();

    @Override
    public boolean hasAnimalTranslator() {
        return true;
    }

    @Override
    public String name() {
        return "Ferdynand";
    }

    public List<Animal> getOwnedAnimals() {
        return ownedAnimals;
    }
}
