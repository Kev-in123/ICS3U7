public class ChangingDogs extends ConsoleProgram
{
    public void run()
    {
        String originalName = "Sammy";
        String originalBreed = "Golden Retriever";
        
        Dog originalDog = new Dog(originalBreed, originalName);
        
        System.out.println("Original Dog: " + originalDog);
        
        // Changing Dog via copying to a different local variable
        Dog newDog = originalDog;
        
        // newDog and originalDog now point to the same memory!
        
        newDog.setName("Tracy");
        
        // originalDog has now been changed!
        System.out.println();
        System.out.println("New Dog: " + newDog);
        System.out.println("Original Dog: " + originalDog);
        if(!originalDog.getName().equals(originalName))
        {
            System.out.println("You changed my dog!");
        }
        
        System.out.println();
        
        // Changing Dog via passing as a parameter
        changeBreed(originalDog);
        
        // originalDog has now been changed!
        System.out.println("Original Dog: " + originalDog);
        if(!originalDog.getBreed().equals(originalBreed))
        {
            System.out.println("You changed my dog again!");
        }
        
        System.out.println();
        
        // The noChange method does not affect the original Dog!
        Dog testDog = new Dog("Poodle", "Gunther");
        noChange(testDog);
        if(testDog.getBreed().equals("Poodle"))
        {
            System.out.println("testDog was not changed!");
        }
    }
    
    public void changeBreed(Dog parameterDog)
    {
        // parameterDog points to the same memory as originalDog!
        parameterDog.setBreed("Great Dane");
        System.out.println("parameterDog: " + parameterDog);
    }
    
    public void noChange(Dog parameterDog)
    {
        // parameterDog originally points to the same memory as testDog
        
        // But this line changes the parameterDog to point to new memory!
        parameterDog = new Dog("Terrier", "Toto");
        
        // This line now only affects parameterDog, testDog is unaffected!
        parameterDog.setBreed("Pitbull");
    }
}