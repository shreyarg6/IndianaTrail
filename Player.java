package Program;
/**
 * @author Shreya G
 * @date 4/15/22
 * @Purdue CNIT 255
 */
public class Player implements PlayerActivity
{
    public PlayerInventory c;
    public PlayerInventory h;
    public PlayerInventory p;
    public boolean isGameOn;
    public Player()
    {
        c = new Coin();
        h = new Health();
        p = new Progress();
        isGameOn = true;
    }
    public void buyWater()
    {
        c.decrease(1);
        h.increase(7);
    }
    public void buyBandaid()
    {
        c.decrease(2);
        h.increase(7);
    }
    public void buyGauze()
    {
        c.decrease(3);
        h.increase(10);
    }
    public void moveForward()
    {
        p.increase(10);
        h.decrease(12);
    }
    public int getGameStatus()
    {
        if (h.getValue() <= 0)
        {
            return 0;
        }
        else if (p.getValue() >= 100)
        {
            return 1;
        }
        return -1;
    }
    public void reset()
    {
        c.reset();
        h.reset();
        p.reset();
    }
}
