import java.util.*;

public class Array {
  public static void deletionArray(int[] array, Scanner scan)
  {
    System.out.print("Enter the index value for deletion - ");
    int index = scan.nextInt();
    if(index > array.length)
    {
      System.out.println("Wrong Index value");
      return;
    }
    array[index] = -1;
    System.out.println("Array after "+ index +" Deletion");
    retrieveArray(array);
  }
  public static void updationArray(int[] array, Scanner scan)
  {
    System.out.print("Enter the index value for Updation - ");
    int index = scan.nextInt();
    if(index > array.length)
    {
      System.out.println("Wrong Index value");
      return;
    }
    System.out.println("Enter the new value for Index "+ index);
    array[index] = scan.nextInt();
    System.out.println("Array after "+ index +" Updation");
    retrieveArray(array);
  }
  public static void retrieveArray(int[] array)
  {
    for (int i = 0; i < array.length; i++)
    {
      System.out.println("Array[INDEX "+ i +"] = "+ array[i]);
    }
    return;
  }
  public static void main(String[] arr)
  {
    String cont = "y";
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the length of Array - ");
    int arrayLength = scan.nextInt();
    int[] array = new int[arrayLength];
    System.out.println("Enter elements of Array - ");
    for (int i = 0; i < arrayLength; i++)
    {
      array[i] = scan.nextInt();
    }
    while (cont.toLowerCase().equals("y")) {
      System.out.println("Enter the Operation to be performed on an Inserted Array - ");
      System.out.println("1) DEL - for Deletion\n2) UPD - for Updation\n3) RET - for Retrieval");
      String choice = scan.next();
      switch (choice) {
        case "DEL":
          deletionArray(array, scan);
          break;
        case "UPD":
          updationArray(array, scan);
          break;
        case "RET":
          retrieveArray(array);
          break;
        default:
          System.out.println("You have Entered a wrong Choice");
          break;
      }
      System.out.println("Do you want to continue Y/N");
      cont = scan.next();
    }
  }
}
