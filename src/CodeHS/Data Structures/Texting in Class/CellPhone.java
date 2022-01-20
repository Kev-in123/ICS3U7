import java.util.*;

public class CellPhone
{
    private ArrayList<TextMessage> texts;
    
    public CellPhone()
    {
        texts = new ArrayList<TextMessage>();
    }
    
    public void addText(TextMessage text)
    {
        texts.add(text);
    }
    
    public ArrayList<TextMessage> getTextMessages()
    {
        return texts;
    }
}