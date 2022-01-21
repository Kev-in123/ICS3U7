public class ApplePie extends Pie
{
    private String crustType;
    private int numSlices;
    
    public ApplePie(int numSlices)
    {
        super("Apple Pie", 67);
        this.numSlices = numSlices;
    }
    
    public void eatSlice()
    {
        System.out.println("Eating a slice.");
        numSlices--;
    }
    
    public boolean hasSlicesLeft()
    {
        return numSlices > 0;
    }
    
    public String toString()
    {
        return "Apple Pie with " + numSlices + " slices left.";
    }
}