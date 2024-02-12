import java.util.Scanner;

public class Quicksort {
    public static void quicksort(int array[],int low,int high){
        if (low < high){
            int pivot = low;
            int storeindex = pivot+1;
            for (int i = pivot+1; i <= high; i++){
                if (array[i] < array[pivot]){
                    int temp = array[i];
                    array[i] = array[storeindex];
                    array[storeindex] = temp;
                    storeindex++;
                }
            }
            int tem = array[pivot];
            array[pivot] = array[storeindex-1];
            array[storeindex-1] = tem;
            quicksort(array,low,storeindex-2);
            quicksort(array, storeindex, high);
        }

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scan.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++){
            array[i] = scan.nextInt();
        }
        quicksort(array,0,n-1);
        System.out.print("The array: ");
        for (int i = 0; i < n; i++){
            System.out.print(array[i]+" ");
        }
    }
}
