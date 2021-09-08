
package burak_erdilli_19011046;

import java.text.ParseException;
import java.util.Date;

import org.junit.Test;
import java.text.SimpleDateFormat;
import static org.junit.Assert.*;


public class SubscriptionTest {
    
    public SubscriptionTest() {
    }



    @Test
    public void testGetSubscriptionStartDate() throws ParseException{
        System.out.println("getSubscriptionStartDate");
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date testDate =formatter.parse("12/12/2020");
        SubscriptionPlan testPlan =new SubscriptionPlan("test1");
        Subscription instance =new Subscription(testDate,testPlan);
        Date result = instance.getSubscriptionStartDate();
        assertEquals(testDate, result);

    }


    @Test
    public void testSetSubscriptionStartDate()throws ParseException {
        System.out.println("getSubscriptionStartDate");
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date testDate =formatter.parse("12/12/2020");
        SubscriptionPlan testPlan =new SubscriptionPlan("test1");
        Subscription instance =new Subscription(null,null);
        instance.setSubscriptionStartDate(testDate);
        
    }


   
}
