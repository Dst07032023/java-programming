package Ecaterina.java2.day37_static.bestbuy;

public class BestBuyStores {

    public static void main(String[] args) {

        //BestBuy.location = "Fairfax"; //location is an instance variable, so we need an object
        //inorder to acces
        BestBuy store1 = new BestBuy();
        store1.location = "Fairfax";
        System.out.println(store1.location);

        System.out.println(BestBuy.headquarters);//this is a static variable, which means we can use the class
        // name to access
        System.out.println(store1.headquarters);//instances(object) come from a class & static members belong
        // to class.this is valid syntax, but you should use the class name to access, but instance references

        // other static members
        System.out.println(Math.PI); //Pi is static
        System.out.println(Integer.MIN_VALUE);// min value is static

        //Arrays.sort(); accessing static method from Arrays class
    }
}
