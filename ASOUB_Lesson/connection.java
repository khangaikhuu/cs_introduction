
/**
 * Write a description of class connection here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class connection
{
    private int sizeOfNodes = 0;
    private node n1;
    private node n2;
    private node n3;
    private node n4;
    private node n5;
    
    public connection(node n1, node n2, node n3, node n4, node n5)
    {
        n1 = n1;
        n2 = n2;
        n3 = n3;
        n4 = n4;
        n5 = n5;
    }
    public int mySizeOfNodes()
    {
        return sizeOfNodes;
       
    }
}
