class Mobile {

    String brand;
    int price;
    String name;

public  void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void main(String[] args) throws ClassNotFoundException{
        
        Mobile mob1 = new Mobile();
        mob1.brand = "Apple";
        mob1.price = 10000;
        mob1.name = "Smart phone";

        Mobile mob2 = new Mobile();
        mob2.brand = "Samsung";
        mob2.price = 10000;
        mob2.name = "Smart phone";

        mob1.show();
        mob2.show();
    }
}
