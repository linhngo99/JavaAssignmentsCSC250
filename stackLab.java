import java.util.Stack;

public class stackLab
{
  public static void main(String arg[])
  {
      Stack<String> animals= new Stack<>();

      animals.push("Bear");
      animals.push("Tiger");
      animals.push("Lion");
      animals.push("Deer");


      System.out.println(animals);
      System.out.println(animals.peek());

      animals.pop();
      System.out.println(animals);

      int x = animals.search("Tiger");
      if(x != -1) {
        System.out.println("Element found");
      } else {
        System.out.println("Element not found");
      }

      int y = animals.search("Dog");
      if(y != -1) {
        System.out.println("Element found");
      } else {
        System.out.println("Element not found");
      }
      
  }
}
