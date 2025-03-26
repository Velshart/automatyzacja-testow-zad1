package me.mmtr.objects;

import me.mmtr.interfaces.Animal;
import me.mmtr.interfaces.Person;

import java.util.ArrayList;
import java.util.List;

public class NonScientist implements Person {

    private final List<Animal> ownedAnimals = new ArrayList<>();

    @Override
    public boolean hasAnimalTranslator() {
        return false;
    }

    @Override
    public String name() {
        return "Krzysztof";
    }

    public List<Animal> getOwnedAnimals() {
        return ownedAnimals;
    }
}
