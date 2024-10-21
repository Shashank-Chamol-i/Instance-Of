class Vegitable
{

}
class Tomato extends Vegitable
{
}
public class Program02 {
   public static void main(String[] args)
   {
       Tomato t = new Tomato();
       System.out.println(t instanceof Vegitable);
   }
}
