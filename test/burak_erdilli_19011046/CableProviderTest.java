
package burak_erdilli_19011046;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author berdi
 */
public class CableProviderTest {
    
    public CableProviderTest() {
    }
    

    @Test
    public void testAddSubscriptionPlan() {
        System.out.println("addSubscriptionPlan");
        SubscriptionPlan sub= new SubscriptionPlan("testPlan");
        CableProvider instance = new CableProvider("testProvider",1);
        instance.addSubscriptionPlan(sub);

    }


    @Test
    public void testFindSubscriptionPlan() {
        System.out.println("findSubscriptionPlan");
        String s = "testPlan";
        CableProvider instance = new CableProvider("testProvider",1);
        SubscriptionPlan expResult = new SubscriptionPlan(s);
        instance.addSubscriptionPlan(expResult);
        SubscriptionPlan result = instance.findSubscriptionPlan(s);
        assertEquals(expResult, result);

    }




    
}
