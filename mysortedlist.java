import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

public class mysortedlist
{

//linear search for linked list
  public static int linerSearch(LinkedList<Integer> myList1, int key)
  {
    Integer[] myArray = myList1.toArray(new Integer[myList1.size()]);

    for(int i=0;i <myArray.length; i++)
    {
      if(myArray[i] == key){
        return i;
      }
    }
    return -1;
  }

  public static void selectionSort(int[] arr1)
  {

    for (int i= 0; i< arr1.length-1; i++)
    {
      int index = i;
      for ( int j = i+ 1; j < arr1.length; j++)
      {
        if (arr1[j] < arr1[index])
        {
          index = j;//searching for lowest index
          }
        }
        int smallerNumber= arr1[index];
        arr1[index] = arr1[i];
        arr1[i] = smallerNumber;
      }
    }

    public static int[] doInsertionSort(int[] input)
    {
      int temp;
      for (int i= 1; i< input.length; i++)
      {
        for(int j = i; j > 0 ; j--)
        {// moving the left side element to one position forward.
          if(input[j] < input[j-1])
          {
            temp = input[j];
            input[j] = input[j-1];
            // moving current element to its  correct position.
            input[j-1] = temp;
          }
        }
      }
      return input;
    }

  static void bubbleSort(int[] arr)
  {
    int n = arr.length;
    int temp = 0;
    for(int i=0; i< n; i++)
    {
      for(int j=1; j < (n-i); j++)
      {  if(arr[j-1] > arr[j])
        {  //swap elements
          temp = arr[j-1];
          arr[j-1] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  public static void main(String arg[])
  {
    Scanner scan = new Scanner(System.in);
//creating linked list with user input
    System.out.println("Enter 10 numbers");
    LinkedList<Integer> myList1 = new LinkedList<>();
    for (int i = 0 ; i < 10; i++ ) {
      int input = scan.nextInt();
      myList1.add(input);
    }

    System.out.println("ELement 49 found at: " + linerSearch(myList1, 49));

    int[] arr1 = {45,22,2,6,73,7,8,4,56,7};
    System.out.println("Before selection sort: ");
    for(int l = 0; l<10; l++){
        System.out.print(arr1[l]+" ");
      }
    selectionSort(arr1);
    System.out.println();
    System.out.println("After selection sort: ");
    for(int x = 0; x<10; x++){
        System.out.print(arr1[x]+" ");
      }

    int[] array1 = {10,34,2,56,7,67,88,42};
    System.out.println();
    System.out.println("Before Insertion sort: ");
    for(int t:array1)
    {
      System.out.print(t);
      System.out.print(" ");
    }
    int[] array2 = doInsertionSort(array1);
    System.out.println();
    System.out.println("After Insertion sort: ");
    for(int q:array2)
    {
      System.out.print(q);
      System.out.print(" ");
    }

    int[] array3 = {100,4,67,12,34,56,1,20};
    System.out.println("Before Bubble sort: ");
    for(int h:array3)
    {
      System.out.print(h);
      System.out.print(" ");
    }
    bubbleSort(array3);
    System.out.println();
    System.out.println("After Bubble sort: ");
    for(int b:array3)
    {
      System.out.print(b);
      System.out.print(" ");
    }

    Integer[] linkedtoarray = myList1.toArray(new Integer[myList1.size()]);
    int keyele = 98;
    int result = Arrays.binarySearch(linkedtoarray,keyele);
    if (result < 0)
    {
      System.out.println("Element is not found!");
     }
    else
    {
      System.out.println("Element is found at index: " + result);
    }
  }


}
