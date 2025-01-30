public class Q_02 {
    int num1;
    int num2;

    Q_02(int num1,int num2){
        this.num1=num1;
        this.num2=num2;

    }
    void display(){
        System.out.println(num1+" & "+num2);
    }
    void Swapping(){
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
    }


    public static void main(String[] args) {
        Q_02 obj=new Q_02(10,11);

        System.out.println("Before swap");
        obj.display();

        System.out.println("After swap");
        obj.Swapping();
        obj.display();

    }
}
