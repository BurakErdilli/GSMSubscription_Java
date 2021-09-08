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
public class CableProvider implements ServiceProvider {

    private String name;
    private SubscriptionPlan[] subscriptionPlans;

    public CableProvider(String s, int count) {
        this.name = s;
        subscriptionPlans = new SubscriptionPlan[count];

    }

    @Override
    public void addSubscriptionPlan(SubscriptionPlan s) {

        int i = 0;
        while (i < subscriptionPlans.length && subscriptionPlans[i] != null) {
            i++;

        }
        if (i != subscriptionPlans.length) {
            subscriptionPlans[i] = s;

        }
    }

    @Override
    public SubscriptionPlan findSubscriptionPlan(String s) {

        int i = 0;
        while (i < subscriptionPlans.length && subscriptionPlans[i] != null) {
            if (s == subscriptionPlans[i].getName()) {
                return subscriptionPlans[i];

            }
            i++;

        }
        return null;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }



}
