import java.util.Scanner;
public class RemoveElementFromArray {
     public static int[] fillArray(int size) {
     Scanner scanner = new Scanner(System.in);
     int[] array = new int[size];

     System.out.println("Array elementlerini daxil edin:");
     for (int i = 0; i < size; i++) {
         array[i] = scanner.nextInt();
     }
     return array;
 }
 public static void printArray(int[] array) {
     System.out.print("Array: [");
     for (int i = 0; i < array.length; i++) {
         System.out.print(array[i]);
         if (i < array.length - 1) {
             System.out.print(", ");
         }
     }
     System.out.println("]");
 }
 public static int[] removeElement(int[] array, int element) {
     int indexToRemove = -1;
     for (int i = 0; i < array.length; i++) {
         if (array[i] == element) {
             indexToRemove = i;
             break;
         }
     }
     if (indexToRemove != -1) {
         int[] newArray = new int[array.length - 1];
         int newIndex = 0;

         for (int i = 0; i < array.length; i++) {
             if (i != indexToRemove) {
                 newArray[newIndex] = array[i];
                 newIndex++;
             }
         }

         return newArray;
     } else {
         return array;
     }
 }

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Array-in olcusunu daxil edin: ");
     int size = scanner.nextInt();

     int[] array = fillArray(size);

     System.out.print("Silinecek elementi daxil edin: ");
     int elementToRemove = scanner.nextInt();
     array = removeElement(array, elementToRemove);
     printArray(array);
 }   
}
