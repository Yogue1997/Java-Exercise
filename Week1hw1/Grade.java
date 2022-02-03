
class Grade{
    public static void main (String arg[]){
        int grades;
        grades = 120;

        if(grades >= 90 ){
            System.out.println("A");
        }
        else if (grades >= 80){
            System.out.println("B");
        }
        else if (grades >= 70){
            System.out.println("C");
        }
        else if (grades >= 55){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}