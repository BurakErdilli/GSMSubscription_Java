/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burak_erdilli_19011046;

/**
 *
 * @author berdi
 */
public interface ServiceProvider {
    public void addSubscriptionPlan(SubscriptionPlan s);
    public SubscriptionPlan findSubscriptionPlan(String s);
    public String getName();
    public void setName(String name);
    
    
    
}
