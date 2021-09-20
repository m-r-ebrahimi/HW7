package ir.maktab.subscription;

public class DemoSubscriptions {
    NewspaperSubscription newspaper_1 = new PhysicalNewspaperSubscription("newspaper_1");
    NewspaperSubscription newspaper_2 = new PhysicalNewspaperSubscription("newspaper_2");
    NewspaperSubscription newspaper_3 = new OnlineNewspaperSubscription("newspaper_3");
    NewspaperSubscription newspaper_4 = new OnlineNewspaperSubscription("newspaper_4");

    public void run() {
        newspaper_1.setAddress("ave_1, bank street");
        newspaper_2.setAddress("ave_s, bank street");
        newspaper_3.setAddress("ave_1, @bank street");
        newspaper_1.setAddress("ave_1, bank street");
        print();
    }

    private void print() {
        System.out.println(newspaper_1);
        System.out.println(newspaper_2);
        System.out.println(newspaper_3);
        System.out.println(newspaper_4);
    }
}
