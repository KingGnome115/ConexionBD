package basico;

/**
 *
 * @author Kevin
 */
public class Objeto
{

    private int id;
    private String item2;
    private float item3;

    public Objeto()
    {
    }

    public Objeto(int id, String item2, float item3)
    {
        this.id = id;
        this.item2 = item2;
        this.item3 = item3;
    }

    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * @return the item2
     */
    public String getItem2()
    {
        return item2;
    }

    /**
     * @param item2 the item2 to set
     */
    public void setItem2(String item2)
    {
        this.item2 = item2;
    }

    /**
     * @return the item3
     */
    public float getItem3()
    {
        return item3;
    }

    /**
     * @param item3 the item3 to set
     */
    public void setItem3(float item3)
    {
        this.item3 = item3;
    }

}
