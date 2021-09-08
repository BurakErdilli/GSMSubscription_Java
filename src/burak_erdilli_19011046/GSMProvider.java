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
public class GSMProvider implements ServiceProvider {

    private String name;
    private SubscriptionPlan[] subscriptionPlans;

    public GSMProvider(String s, int amount) {
        this.name = s;
        subscriptionPlans = new SubscriptionPlan[amount];

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
            if (s == null ? subscriptionPlans[i].getName() == null : s.equals(subscriptionPlans[i].getName())) {
                System.out.println("Found");
                return subscriptionPlans[i];

            }
            i++;

        }
        System.out.println("Not Found");
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
