package Program;
/**
 * @author Shreya G
 * @date 4/15/22
 * @Purdue CNIT 255
 */
public class Coin extends PlayerInventory
{
   
    public Coin()
    {
        value = 7;
    }
    public void reset()
    {
        value = 7;
    }
    
    public void increase(int dc)
    {
        value = value + dc;
    }
    
    public void decrease(int dc)
    {
        value = value - dc;
    }

}
