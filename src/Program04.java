class Animal
{

}
class Dog extends Animal
{
    static void method(Animal a)
    {
        Dog d = (Dog)a;
        System.out.println("DownCasting Performed : ");
    }
}
public class Program04 {
    public static void main(String[] args)
    {
        Animal a = new Dog();
        Dog.method(a);

    }
}
