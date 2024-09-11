public class Problem2
{
  public static void main(String[] args)
  {
    int So3 = 257;
    System.out.println("The number is " + So3);
    System.out.println(So3 % 10);
    So3 = So3 - ((So3 % 10) + (So3/10));
    System.out.println(So3 % 100);
    So3 = So3 - (So3 % 100);
    System.out.println(So3 % 1000);
  }
}