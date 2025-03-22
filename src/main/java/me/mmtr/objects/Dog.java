package me.mmtr.objects;

import me.mmtr.interfaces.Animal;
import me.mmtr.interfaces.Person;

public class Dog implements Animal {
    @Override
    public String replyToPerson(Person person) {
        if (person.hasAnimalTranslator()) {
            return person.name() + ", czy Ty rozumiesz psi? Ale super!";
        }
        return "Woof, woof";
    }

    @Override
    public String makeSoundForPerson(Person person) {
        if (person.hasAnimalTranslator()) {
            return "Hej, jestem psem!";
        }
        return "Woof";
    }
}
