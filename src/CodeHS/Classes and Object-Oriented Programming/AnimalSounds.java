public class AnimalTester extends ConsoleProgram
{
    public void run()
    {
        Animal dog = new Dog();
        Animal cow = new Cow();
        Animal pig = new Pig();
        
        dog.talk();
        cow.talk();
        pig.talk();
    }
}