import me.mmtr.objects.Cat;
import me.mmtr.objects.Dog;
import me.mmtr.objects.NonScientist;
import me.mmtr.objects.Scientist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AnimalPersonCommunicationTests {
    NonScientist nonScientist = Mockito.mock(NonScientist.class);
    Scientist scientist = Mockito.mock(Scientist.class);

    Dog dog = new Dog();
    Cat cat = new Cat();

    @BeforeEach
    public void setUp() {
        Mockito.when(nonScientist.hasAnimalTranslator()).thenReturn(false);
        Mockito.when(scientist.hasAnimalTranslator()).thenReturn(true);

        Mockito.when(scientist.name()).thenReturn("Ferdynand");
    }

    @Test
    public void dogShouldReturnWoofIfNoAnimalTranslatorWhenAskedToMakeASound() {
        Assertions.assertEquals("Woof", dog.makeSoundForPerson(nonScientist));
    }

    @Test
    public void catShouldReturnMeowIfNoAnimalTranslatorWhenAskedToMakeASound() {
        Assertions.assertEquals("Meow", cat.makeSoundForPerson(nonScientist));
    }

    @Test
    public void dogShouldTalkIfAPersonHasAnimalTranslatorwhenAskedToMakeASound() {
        Assertions.assertEquals("Hej, jestem psem!", dog.makeSoundForPerson(scientist));
    }

    @Test
    public void catShouldTalkIfAPersonHasAnimalTranslatorWhenAskedToMakeASound() {
        Assertions.assertEquals("Hej, jestem kotem!", cat.makeSoundForPerson(scientist));
    }

    @Test
    public void dogShouldReturnDoubleWoofIfNoAnimalTranslatorWhenAskedToReply() {
        Assertions.assertEquals("Woof, woof", dog.replyToPerson(nonScientist));
    }

    @Test
    public void catShouldReturnDoubleMeowIfNoAnimalTranslatorWhenAskedToReply() {
        Assertions.assertEquals("Meow, meow", cat.replyToPerson(nonScientist));
    }

    @Test
    public void dogShouldTalkIfAPersonHasAnimalTranslatorWhenAskedToReply() {
        Assertions.assertEquals("Ferdynand, czy Ty rozumiesz psi? Ale super!",
                dog.replyToPerson(scientist));
    }

    @Test
    public void catShouldTalkIfAPersonHasAnimalTranslatorWhenAskedToReply() {
        Assertions.assertEquals("Ferdynand, czy Ty rozumiesz koci? Ale super!",
                cat.replyToPerson(scientist));
    }
}
