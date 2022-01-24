public class CellPhoneTester extends ConsoleProgram
{
    public void run()
    {
        CellPhone phone = new CellPhone();
        TextMessage t1 = new TextMessage("Alan", "Ada", "Hey");
        TextMessage t2 = new TextMessage("Alan", "Ada", "Whats up?");
        TextMessage t3 = new TextMessage("Alan", "Ada", "Can you help me with my CS hw?");
        TextMessage t4 = new TextMessage("Ada", "Alan", "Sure!");
        
        phone.addText(t1);
        phone.addText(t2);
        phone.addText(t3);
        phone.addText(t4);
        
        for(TextMessage t: phone.getTextMessages())
        {
            System.out.println(t);
        }

    }
}    private ArrayList<TextMessage> texts;