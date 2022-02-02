
class Calculator {
    public static void main (String  arg[]){
        int num1;
        int num2;
        int sum;

        num1 = Integer.parseInt(arg[0]);
        num2 = Integer.parseInt(arg[1]);

        sum = num1 + num2;

        System.out.print(sum);
    }
}