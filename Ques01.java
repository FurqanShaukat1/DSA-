import java.util.Scanner;

public class Ques_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[4];

        for (int i=0;i< arr.length;i++){
            System.out.println("Element no "+(i+1)+":");
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter index number:");
        int k= sc.nextInt();

        System.out.println("Enter item :");
        int item= sc.nextInt();

        boolean isMatched=false;

        if (k < arr.length && item >=0){
            for (int j=0;j < arr.length;j++){
                if (j==k){
                    if (item <arr[j]){
                        arr[j]=item;
                        isMatched=true;
                        break;
                    }
                }
            }
            if (!isMatched){
                System.out.println("item you put is greater than the inputted element");
            }
        }else {
            System.out.println("Invalid index or item. No operation performed.");
        }
        if (isMatched){
            for (int i=0;i< arr.length;i++){
                System.out.print(arr[i]+",");
            }
        }
    }

}
