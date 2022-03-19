
public class operator {

	public static void main(String[] args) {
		
		 int a =10;
         System.out.println(++a); //unary operator
         System.out.println(a);
         int b=5;
         int c;
         c=a+b; //binary operator
         System.out.println(c);
         int marks; //ternary operator
         Scanner sc =new Scanner(System.in);
         System.out.println("enter marks of student ");
         marks =sc.nextInt();
         String result;
      result= marks > 35 ? "pass":"fail";
      System.out.println(result);

	}

}
