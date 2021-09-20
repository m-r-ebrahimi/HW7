package ir.maktab;

public abstract class NewspaperSubscription {
    protected String name;
    protected String address;
    protected int price;

    public NewspaperSubscription() {
    }

    public NewspaperSubscription(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void setAddress(String address);
    public abstract void setPrice(int price);

}
