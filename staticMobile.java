class Mobile1 {

    String brand;
    int price;
    String name;
    static String pro1;
    static String pro;
    static void show(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + obj.name + "  :  "+pro1);
    } 
    void show1 () {
        System.out.println(brand + " : " + price + " : " + name + "  :  "+pro);
    }
    static {
            pro="Snapdragon Elite";
            pro1="A18 pro";
            System.out.println("In Staic Block");
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

        Mobile.show(mob1);

        mob2.show1();
    }
}
