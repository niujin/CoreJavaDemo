
import java.util.Vector; /* Line 2 */
class Super
{ 
    public volatile int i = 0; 

    public volatile Super  s = null;
    
    public Super(String text) /* Line 4 */
    {
        i = 1; 
    } 
} 

class Test1 extends Super
{
    public Test1(String text)
    {
        i = 2; 
    } 

    public static void main(String args[])
    {
    	Test1 sub = new Test1("Hello"); 
        System.out.println(sub.i); 
    } 
}
