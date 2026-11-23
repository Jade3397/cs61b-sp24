public class Dessert
{
    private int flavor;
    private int price;
    static int numDesserts;

    //constructor 构造器(构造函数)
    public Dessert(int flavor,int price)
    {
        this.flavor = flavor;
        this.price = price;
        numDesserts++;
    }

    public void printDessert()
    {
        System.out.println(flavor + " " + price + " " + numDesserts);
    }

    public static void main(String[] args)
    {
        System.out.println("I love dessert!");
    }
}
