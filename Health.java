package Program;
/**
 * @author Shreya G
 * @date 4/15/22
 * @Purdue CNIT 255
 */
public class Health extends PlayerInventory
{
     public Health()
    {
        value = 100;
    }
    public void reset()
    {
        value = 100;
    }
    public void decrease(int i)
    {
        value = value - i;
    }
    @Override
    public void increase(int i)
    {
        if (value + i > 100)
            value = 100;
        else
            value = value + i;
    }
   
}
