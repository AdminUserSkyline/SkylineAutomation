package myAutomationPractice;

  public class Constructor {
  static int i;
  static String name;
  static  double a;
  static boolean b;
   
   Constructor(int x,String s,double d,boolean bool )
   {
	   i=x;
	   name =s;
	   a=d;
	   b=bool;
   }
	   
	   
   public static void main(String[] args) {
   
  Constructor cons1=new Constructor(5,"Rudra",5.8,false);
  System.out.println(i);
  System.out.println(name);
  System.out.println(a);
  System.out.println(b);
  
  
	}

}
