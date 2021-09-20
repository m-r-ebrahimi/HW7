package ir.maktab;

public class OnlineNewspaperSubscription extends NewspaperSubscription{

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
}
