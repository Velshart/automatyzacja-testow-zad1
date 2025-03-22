package me.mmtr;

import me.mmtr.interfaces.Person;
import me.mmtr.objects.Cat;
import me.mmtr.objects.Dog;
import me.mmtr.objects.NonScientist;
import me.mmtr.objects.Scientist;

public class Main {
    public static void main(String[] args) {
        Person nonScientist = new NonScientist();
        Person scientist = new Scientist();

        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println(nonScientist.name());
        System.out.println(scientist.name());

        System.out.println();

        System.out.println(cat.makeSoundForPerson(nonScientist));
        System.out.println(dog.makeSoundForPerson(nonScientist));
        System.out.println(cat.replyToPerson(nonScientist));
        System.out.println(dog.replyToPerson(nonScientist));

        System.out.println();

        System.out.println(cat.makeSoundForPerson(scientist));
        System.out.println(dog.makeSoundForPerson(scientist));
        System.out.println(cat.replyToPerson(scientist));
        System.out.println(dog.replyToPerson(scientist));

    }
}