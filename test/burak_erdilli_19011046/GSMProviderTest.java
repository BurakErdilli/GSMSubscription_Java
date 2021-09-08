/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burak_erdilli_19011046;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author berdi
 */
public class GSMProviderTest {
    
    public GSMProviderTest() {
    }


    @Test
    public void testAddSubscriptionPlan() {
        System.out.println("addSubscriptionPlan");
        SubscriptionPlan sub= new SubscriptionPlan("testPlan");
        GSMProvider instance = new GSMProvider("testProvider",1);
        instance.addSubscriptionPlan(sub);

    }
    @Test
    public void testFindSubscriptionPlan() {
        System.out.println("findSubscriptionPlan");
        String s = "testPlan";
        GSMProvider instance = new GSMProvider("testProvider",1);
        SubscriptionPlan expResult = new SubscriptionPlan(s);
        instance.addSubscriptionPlan(expResult);
        SubscriptionPlan result = instance.findSubscriptionPlan(s);
        assertEquals(expResult, result);
    }


    
}
