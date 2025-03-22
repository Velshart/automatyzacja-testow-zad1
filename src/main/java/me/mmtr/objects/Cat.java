package me.mmtr.objects;

import me.mmtr.interfaces.Animal;
import me.mmtr.interfaces.Person;

public class Cat implements Animal {
    @Override
    public String replyToPerson(Person person) {
        if (person.hasAnimalTranslator()) {
            return person.name() + ", czy Ty rozumiesz koci? Ale super!";
        }
        return "Meow, meow";
    }

    @Override
    public String makeSoundForPerson(Person person) {
        if (person.hasAnimalTranslator()) {
            return "Hej, jestem kotem!";
        }
        return "Meow";
    }
}
