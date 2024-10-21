/*DownCasting using instance of */
class Vegi
{

}
class Pumpkin extends Vegi
{
    static void objectonversion(Vegi v)
    {
        if(v instanceof Vegi)
        {
            Pumpkin p = (Pumpkin)v;
            System.out.println("DownCasting Successully Peroformed : ");
        }
    }
}
public class Program05 {
    public static void main(String[] args)
    {
        Vegi v = new Pumpkin();
        Pumpkin.objectonversion(v);

    }
}

