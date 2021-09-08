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
public class CustomerTest {
    
    public CustomerTest() {
    }
    @Test
    public void testSetTel() {
        System.out.println("setTel");
        String tel = "";
        Customer instance = new Customer(null) {};
        instance.setTel(tel);

    }

    @Test
    public void testGetMail() {
        System.out.println("getMail");
        Customer instance = null;
        String expResult = "";
        String result = instance.getMail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMail method, of class Customer.
     */
    @Test
    public void testSetMail() {
        System.out.println("setMail");
        String mail = "";
        Customer instance = null;
        instance.setMail(mail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CustomerImpl extends Customer {

        public CustomerImpl() {
            super("");
        }
    }
    
}
