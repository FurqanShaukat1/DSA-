import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        //Check if two floating type numbers are same
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number:1");
        float num1= sc.nextFloat();

        System.out.println("Enter number:2");
        float num2= sc.nextFloat();

        boolean isSame=Check(num1,num2);

        if (isSame){
            System.out.println("Both numbers are same by 3 decimals places");
        }
        else {
            System.out.println("Numbers are not same!!!!");
        }
    }
    public static boolean Check(float num1, float num2){
        num1=num1*1000;
        num2=num2*1000;

        int integer01=(int)num1;
        int integer02=(int)num2;

        float deci01=num1-integer01;
        float deci02=num2-integer02;


        if (deci01 >=0.5 && deci02>=0.5){
            integer01=integer01+1;
            integer02=integer02+1;

            if (integer01 == integer02){

                return true;

            }
            else {
                return false;
            }
        }
        else if (deci01 < 0.5 && deci02 < 0.5) {
            if (integer01 == integer02){

                return true;

            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

}

