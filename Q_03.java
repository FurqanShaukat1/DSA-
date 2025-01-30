import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[3];

        for (int i=0;i<3;i++){
            System.out.print("element:"+(i+1));
            arr[i]=sc.nextInt();
        }
        checkingOrder(arr);
    }
    public static void checkingOrder(int[] arr){
        boolean isAscend=false,isDescend=false;

        for (int i=0;i< arr.length-1;i++){
            if (arr[i]<arr[i+1]){
                isAscend=true;
            }
            else {
                isAscend=false;
                break;
            }
        }
        if (!isAscend){
            for (int i=0;i< arr.length-1;i++){
                if (arr[i]>arr[i+1]){
                    isDescend=true;
                }
                else {
                    isDescend=false;
                    break;
                }
            }
        }
        if (!isAscend && !isDescend){
            System.out.println("Array is unsorted");
        }
        else if (isAscend) {
            System.out.println("Array is in ascending order");

        }
        else {
            System.out.println("Array is in descending order");
        }
    }
}
