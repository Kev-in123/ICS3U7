import java.util.*;

public class Phonebook extends ConsoleProgram
{
    public void run()
    {
        HashMap<String, String> phonebook = new HashMap<String, String>();
        
        phonebook.put("Alan Turing", "312-423-1234");
        phonebook.put("Ada Lovelace", "312-412-9080");
        phonebook.put("George Boole", "398-134-2342");
        phonebook.put("Grace Hopper", "423-123-1242");

        
        String alansNumber = phonebook.get("Alan Turing");
        System.out.println("Alan's number: " + alansNumber);
        
        
        System.out.println("The Full Phonebook");
        for(String key: phonebook.keySet())
        {
            String number = phonebook.get(key);
            System.out.println(key + ": " + number);
        }
        
    }
}