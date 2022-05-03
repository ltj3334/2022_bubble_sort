import java.util.Scanner;
import java.util.Arrays;

class TestBubbleSort {
    public static void sort(int[] a) {
 	########
        
    Fill out this part
        
    ########
    }

    public static void swap(int[] temp, int a, int b) {
        int tmp = temp[a];
        temp[a] = temp[b];
        temp[b] = tmp;
    }

    public static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int intCounter = Integer.parseInt(line);

        line = scanner.nextLine();
        String[] intStr = line.split(" ");

        int input[] = new int[intCounter];

        for(int i=0; i<intCounter; i++)
            input[i] = Integer.parseInt(intStr[i]);

 	    sort(input);
        printArray(input);
        /*System.out.print(Arrays.toString(input));
        for(int element: input) {
            System.out.print(element + " ");
        }
        */
    }
}
