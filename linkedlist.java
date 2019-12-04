import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedlist
{
  public static void main(String arg[])
  {

      LinkedList<String> classEnroll = new LinkedList<>();

      classEnroll.add("Math");
      classEnroll.add("Chemistry");
      classEnroll.add("History");
      classEnroll.add("Ceramics");

      System.out.println("LinkedList: " + classEnroll);

      classEnroll.add(2, "English");
      System.out.println("LinkedList after adding English: " + classEnroll);

      classEnroll.addFirst("Physics");
      System.out.println("LinkedList after adding Physics: " + classEnroll);

      classEnroll.addLast("Woodworking");
      System.out.println("LinkedList after adding Woodworking: " + classEnroll);

      System.out.println("First Element: " + classEnroll.getFirst());

      classEnroll.removeLast();
      System.out.println("LinkedList after removing last: " + classEnroll);

       System.out.println ("Index of History: " +classEnroll.indexOf ("History"));
  }
}
