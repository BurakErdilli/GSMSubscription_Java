
package burak_erdilli_19011046;

import org.junit.Test;
import static org.junit.Assert.*;


public class SubscriptionPlanTest {
    
    public SubscriptionPlanTest() {
    }


    @Test
    public void testGetName() {
        System.out.println("getName");
        SubscriptionPlan instance = new SubscriptionPlan("plan");
        String expResult = "exmplan";
        String result = instance.getName();
        assertEquals(expResult, result);

    }


    @Test
    public void testSetName() {
        System.out.println("setName");
        SubscriptionPlan instance = new SubscriptionPlan(null);
        String name = "testName";
        instance.setName(name);

    }


    
}
