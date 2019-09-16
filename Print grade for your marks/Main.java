import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner (System.in);
      int n1 = in.nextInt();
      if (n1>=85)
        System.out.println("A");
      else if (n1>=75)
        System.out.println("b");
       else if (n1>=55)
        System.out.println("c");
       else if (n1>=55)
        System.out.println("d");
       else if (n1>=45)
        System.out.println("e");
       else if (n1<45)
        System.out.println("Fail");
      
    }
}