
package burak_erdilli_19011046;

import java.text.ParseException;
import org.junit.Test;
import static org.junit.Assert.*;
import java.text.SimpleDateFormat;
import java.util.Date;



public class ExistingCustomerTest {
    
    public ExistingCustomerTest() {
    }
    @Test
    public void testGetSubscription() throws ParseException {
        System.out.println("getSubscription");
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date testDate =formatter.parse("12/12/2020"); 
        SubscriptionPlan testPlan = new SubscriptionPlan("testPlan");
        Subscription testResult = new Subscription(testDate,testPlan);
        ExistingCustomer instance = new ExistingCustomer(testResult,null);
        Subscription result = instance.getSubscription();
        assertEquals(testResult, result);

    }

    /**
     * Test of setSubscription method, of class ExistingCustomer.
     */
    @Test
    public void testSetSubscription() throws ParseException{
        System.out.println("getSubscription");
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date testDate =formatter.parse("12/12/2020"); 
        SubscriptionPlan testPlan = new SubscriptionPlan("testPlan");
        Subscription testResult = new Subscription(testDate,testPlan);
        ExistingCustomer instance = new ExistingCustomer(null,null);
        instance.setSubscription(testResult);
        Subscription result = instance.getSubscription();
        assertEquals(testResult, result);

    }
    
}
