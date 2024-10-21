interface Printable
{}
class A implements Printable
{
    static void acalling()
    {

    }
}
class call
{
    void changeObject(Printable p)
    {
        if(p instanceof A)
        {
            A a = (A)p;
        }
    }
}
public class Program06 {
    public static void main(String[] args)
    {
       Printable p = new A();
       call c = new call();


    }
}
