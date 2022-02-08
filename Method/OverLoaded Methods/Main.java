public class Main{

 public static void main(String[] args){

  int x=add(2,3);
int y=add(2,3,5);
int z=add(2,3,5,7);

System.out.println("Sum is: "+x);
System.out.println("Sum is: "+y);
System.out.println("Sum is: "+z);

double a=add(2.0,3.0);
double b=add(2.0,3.0,5.0);
double c=add(2.0,3.0,5.0,7.0);

System.out.println("Sum is: "+a);
System.out.println("Sum is: "+b);
System.out.println("Sum is: "+c);



}
     static int add(int a,int b){

    System.out.println("This is overloaded method #1");
    return a+b;

     }

   static int add(int a,int b,int c){

    System.out.println("This is overloaded method #2");
    return a+b+c;

     }

     static int add(int a,int b,int c,int d){

    System.out.println("This is overloaded method #3");
    return a+b+c+d;

     }

static double add(double  a,double  b){

    System.out.println("This is overloaded method #4");
    return a+b;

     }

   static double add(double  a,double  b,double  c){

    System.out.println("This is overloaded method #5");
    return a+b+c;

     }

     static double add(double  a,double  b,double  c,double  d){

    System.out.println("This is overloaded method #6");
    return a+b+c+d;

     }
   

}