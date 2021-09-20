package ir.maktab;

public class OnlineNewspaperSubscription extends NewspaperSubscription{
    public OnlineNewspaperSubscription() {
    }

    public OnlineNewspaperSubscription(String name) {
        super(name);
    }

    @Override
    public void setAddress(String address) {
        address = address.trim();
        if(checkString(address)){
            super.address=address;
            setPrice(9);
        }else{
            System.out.println("Exception!!!");
            setPrice(0);
        }
    }

    @Override
    public void setPrice(int price) {
        super.price=price;
    }

    private boolean checkString(String str){
        return str.contains("@");
    }

    @Override
    public String toString() {
        return "OnlineNewspaperSubscription{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +"$"+
                '}';
    }
}
