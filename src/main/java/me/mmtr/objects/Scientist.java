package me.mmtr.objects;

import me.mmtr.interfaces.Person;

public class Scientist implements Person {

    @Override
    public boolean hasAnimalTranslator() {
        return true;
    }

    @Override
    public String name() {
        return "Ferdynand";
    }
}
