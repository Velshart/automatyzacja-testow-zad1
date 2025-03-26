import me.mmtr.interfaces.Animal;
import me.mmtr.objects.Cat;
import me.mmtr.objects.Dog;
import me.mmtr.objects.NonScientist;
import me.mmtr.objects.Scientist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class AnimalPersonCommunicationTests {
    private NonScientist nonScientist;
    private Scientist scientist;

    private Dog ownedDog;
    private Cat ownedCat;

    @BeforeEach
    public void setUp() {
        List<Animal> ownedAnimals = new ArrayList<>();
        ownedAnimals.add(new Dog());
        ownedAnimals.add(new Cat());

        ownedDog = (Dog) ownedAnimals.getFirst();
        ownedCat = (Cat) ownedAnimals.get(1);

        nonScientist = Mockito.mock(NonScientist.class);
        scientist = Mockito.mock(Scientist.class);

        Mockito.when(nonScientist.hasAnimalTranslator()).thenReturn(false);
        Mockito.when(scientist.hasAnimalTranslator()).thenReturn(true);

        Mockito.when(scientist.getOwnedAnimals()).thenReturn(ownedAnimals);
        Mockito.when(nonScientist.getOwnedAnimals()).thenReturn(ownedAnimals);

        Mockito.when(scientist.name()).thenReturn("Ferdynand");
    }

    @Test
    public void dogShouldReturnWoofIfNoAnimalTranslatorWhenAskedToMakeASound() {

        Assertions.assertEquals("Woof", ownedDog.makeSoundForPerson(nonScientist));
    }

    @Test
    public void catShouldReturnMeowIfNoAnimalTranslatorWhenAskedToMakeASound() {
        Assertions.assertEquals("Meow", ownedCat.makeSoundForPerson(nonScientist));
    }

    @Test
    public void dogShouldTalkIfAPersonHasAnimalTranslatorwhenAskedToMakeASound() {
        Assertions.assertEquals("Hej, jestem psem!", ownedDog.makeSoundForPerson(scientist));
    }

    @Test
    public void catShouldTalkIfAPersonHasAnimalTranslatorWhenAskedToMakeASound() {
        Assertions.assertEquals("Hej, jestem kotem!", ownedCat.makeSoundForPerson(scientist));
    }

    @Test
    public void dogShouldReturnDoubleWoofIfNoAnimalTranslatorWhenAskedToReply() {
        Assertions.assertEquals("Woof, woof", ownedDog.replyToPerson(nonScientist));
    }

    @Test
    public void catShouldReturnDoubleMeowIfNoAnimalTranslatorWhenAskedToReply() {
        Assertions.assertEquals("Meow, meow", ownedCat.replyToPerson(nonScientist));
    }

    @Test
    public void dogShouldTalkIfAPersonHasAnimalTranslatorWhenAskedToReply() {
        Assertions.assertEquals("Ferdynand, czy Ty rozumiesz psi? Ale super!",
                ownedDog.replyToPerson(scientist));
    }

    @Test
    public void catShouldTalkIfAPersonHasAnimalTranslatorWhenAskedToReply() {
        Assertions.assertEquals("Ferdynand, czy Ty rozumiesz koci? Ale super!",
                ownedCat.replyToPerson(scientist));
    }
}
