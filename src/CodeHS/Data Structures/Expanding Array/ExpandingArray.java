public class ExpandingArray
{
    private static final int STARTING_SIZE = 10;
    private int[] arr;
    private int currentSize;
    private int numElements;
    
    public ExpandingArray()
    {
        arr = new int[STARTING_SIZE];
        currentSize = STARTING_SIZE;
        numElements = 0;
    }
    
    private boolean isFull()
    {
        return numElements == currentSize;
    }
    
    private void expand()
    {
        System.out.println("Expanding");
        
        // Create a new array with twice the size
        int newSize = currentSize * 2;
        int[] newArray = new int[newSize];
        
        // Copy over old elements
        for(int i = 0; i < currentSize; i++)
        {
            newArray[i] = arr[i];
        }
        
        // Update instance variables
        currentSize = newSize;
        arr = newArray;
    }
    
    public int get(int index)
    {
        return arr[index];
    }
    
    public void add(int x)
    {
        if(isFull())
        {
            expand();
        }
        arr[numElements] = x;
        numElements++;
    }
    
    public String toString()
    {
        String str = "{";
        for (int i=0; i < numElements; i++) {
            str += arr[i] + ", ";
        }
        if (str.length() > 0 && str.charAt(str.length()-2)==',') {
            str = str.substring(0, str.length()-2);
            str += "}";
        }
        return str;
    }
}