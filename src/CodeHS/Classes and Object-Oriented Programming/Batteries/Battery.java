public class Battery
{
    private double voltage;
    
    static double totalVoltage = 0;
    static int numOfBatteries = 0;
    
    public Battery(double voltage)
    {
        this.voltage = voltage;
        totalVoltage += this.voltage;
        numOfBatteries++;
    }
    
    public double getVoltage()
    {
        return this.voltage;
        
    }
}