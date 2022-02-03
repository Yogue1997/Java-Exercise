
class Oddeven{
    public static void main (String arg[]) {
        int num;
        num = 4;

        if (num % 2 == 1) {
            System.out.println("Cool");
        }
        else if (num % 2 == 0 & num >= 2 & num <= 5) {
            System.out.println("Not cool");
        }
        else if (num % 2 == 0 & num >=6 & num <= 20) {
            System.out.println("Cool");
        }
        else if (num % 2 == 0 & num > 20) {
            System.out.println("Not cool");
        }
        else{
            System.out.println("Number needs to be 2 or higher than 2");
        }
    }
}