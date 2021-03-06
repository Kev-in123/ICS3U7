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
    
    // Remove the element at index `index` and shift
    // all subsequent elements to the left. 
    public int remove(int index)
    {
        // your code here
        int val = arr[index];
        numElements--;
        while(index < arr.length) {
            if(index == arr.length - 1)
                arr[index++] = 0;
            else
                arr[index++] = arr[index];
        }
        return val;
    }
    
    // Add the int `element` at the `index` in the array.
    // You'll need to shift everything one index to the right
    // after this index.
    public void add(int index, int element)
    {
        // your code here
        if(isFull()) {
            expand();
        }
        
        for(int i = arr.length-1; i >= index; i--)
            arr[i] = arr[i-1];
        arr[index] = element;
        numElements++;
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
    
    // Return the number of elements in your array.
    public int size()
    {
        // your code here
        return numElements;
    }
    
    private boolean isFull()
    {
        return numElements == currentSize;
    }
    
    private void expand()
    {
        System.out.println("Expanding");
        int newSize = currentSize * 2;
        int[] newArray = new int[newSize];
        
        // Copy over old elements
        for(int i = 0; i < currentSize; i++)
        {
            newArray[i] = arr[i];
        }
        
        currentSize = newSize;
        arr = newArray;
    }
    
    public int get(int index)
    {
        return arr[index];
    }
    
    
    
    public String toString()
    {
        String str = "{";
        for (int i=0; i < numElements; i++) {
            str += arr[i] + ", ";
        }
        if (str.length() > 1)
            str = str.substring(0, str.length()-2);
        return str + "}";
    }
}