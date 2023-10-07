package Program;
/**
 * @author Shreya G
 * @date 4/15/22
 * @Purdue CNIT 255
 */
public abstract class PlayerInventory 
{
    public int value = 0;
    public abstract void reset();
  
    public abstract void increase(int i);
    public abstract void decrease(int i);
  
    public int getValue(){
        return value;
    }
    
    public String getValueInStr()
    {
        return Integer.toString(value);
    }
}
