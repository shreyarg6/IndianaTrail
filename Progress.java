package Program;
/**
 * @author Shreya G
 * @date 4/15/22
 * @Purdue CNIT 255
 */
public class Progress extends PlayerInventory
{
   
    public Progress()
    {
        value = 0;
    }
    public void reset()
    {
        value = 0;
    }
    public void increase(int i)
    {
        value = value + i;
    }
    public void decrease(int i)
    {
        value = value - i;
    }
    
}
   
