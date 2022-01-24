import java.util.*;

public class WordCounts extends ConsoleProgram
{
    public void run()
    {
      String s = readLine("Enter a string: ").toLowerCase();
      String[] splitted = s.split(" ");
      Map<String, Integer> hm = new HashMap<String, Integer>();

      for (int i = 0; i < splitted.length ; i++) {
         if (hm.containsKey(splitted[i])) {
            int cont = hm.get(splitted[i]);
            hm.put(splitted[i], cont + 1);
         } else {
            hm.put(splitted[i], 1);
         }
      }
      
      List<String> word_key = new ArrayList<>(hm.keySet());
      Collections.sort(word_key);      
      
      for (String key: word_key) {
            int number = hm.get(key);
            System.out.println(key + ": " + number);
        }
    }
}