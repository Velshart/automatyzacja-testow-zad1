package me.mmtr.objects;

import me.mmtr.interfaces.Person;

public class NonScientist implements Person {

    @Override
    public boolean hasAnimalTranslator() {
        return false;
    }

    @Override
    public String name() {
        return "Krzysztof";
    }
}
