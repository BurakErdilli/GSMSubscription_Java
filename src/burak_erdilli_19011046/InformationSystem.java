package burak_erdilli_19011046;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class InformationSystem {

    public static void main(String[] args) throws ParseException {
//        objeleri dogru sirayla olusturmak icin gerekli bilgileri tutan scannerlar
        Scanner scan = new Scanner(System.in);
        Scanner loop = new Scanner(System.in);
        String[] scanf = new String[5];
//        gerekli bilgiler

        System.out.println("GSM SERVICE PROVIDER :");
        scanf[0] = scan.next();

        System.out.println("NUMBER OF SUBSCRIPTION PLANS:");
        scanf[1] = scan.next();
        int amount;
        amount = Integer.parseInt(scanf[1]);
        String[] loops = new String[amount];
//        plan sayisina bagli olarak plan isimlerinin alinmasi

        for (int i = 0; i < amount; i++) {
            System.out.println("NAME OF THE Plan:#" + i);
            loops[i] = loop.nextLine();
        }
//        objelerin olusturulmasi
        ServiceProvider gsm = new GSMProvider(scanf[0], amount);

        for (int i = 0; i < amount; i++) {
            gsm.addSubscriptionPlan(new SubscriptionPlan(loops[i]));
        }

        System.out.println("CUSTOMER CITIZENSHIP NUMBER:");
        scanf[0] = scan.next();
        System.out.println("CUSTOMER NAME:");
        scanf[1] = scan.next();
        scanf[1] += " ";
        scanf[1] += scan.next();

        System.out.println("NAME OF THE PLAN TO BE SUBSCRIBED:");
        scanf[2] = scan.next();
//        paketin (varsa) bulunması

        while (gsm.findSubscriptionPlan(scanf[2]) == null) {
            System.out.println("Couldn't find a package with this name.Try again!");
            scanf[2] = scan.next();
        }
        SubscriptionPlan subscriptionPlan = new SubscriptionPlan(scanf[2], gsm);

        System.out.println("START DATE FOR SUBSCRIPTION (MM/DD/YYYY):");
        scanf[3] = scan.next();
//        tarihle beraber aboneligin olusturulmasi

        Subscription subscription = new Subscription(new SimpleDateFormat("dd/MM/yyy").parse(scanf[3]), subscriptionPlan);
        Customer customer = new ExistingCustomer(subscription, scanf[0]);
        customer.setName(scanf[1]);

        gsm.addSubscriptionPlan(subscriptionPlan);

        System.out.println("\n--------------\n" + "CUSTOMER CITIZENSHIP NUMBER= " + customer.getCitizenshipNr() + "\n" + "CUSTOMER NAME= " + customer.getName() + "\n" + "SERVICE PROVIDER: " + gsm.getName() + "\n"
                + "SUBSCRIPTION START DATE: " + new SimpleDateFormat("dd/MM/yyy").format(subscription.getSubscriptionStartDate()) + "\n" + "SUBSCRIPTION PLAN NAME: " + subscriptionPlan.getName() + "\n-------------\n");

    }
}
