package ir.maktab;

public class PhysicalNewspaperSubscription extends NewspaperSubscription{

    @Override
    public void setAddress(String address) {
        address = address.trim();
        if(checkStringHaveDigit(address)){
            super.address=address;
            setPrice(15);
        }else{
            System.out.println("Exception!!!");
            setPrice(0);
        }
    }

    @Override
    public void setPrice(int price) {
        super.price=price;
    }

    private boolean checkStringHaveDigit(String str){
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i)))
                return true;
        }
        return false;
    }
}

