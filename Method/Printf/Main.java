public class Main{

  public static void main(String[] args)
{

boolean myBoolean=true;
char myChar='@';
String myString="Tanjil";
int myInt=50;
double myDouble=1000;

System.out.printf("%b",myBoolean);
System.out.printf("\n%c",myChar);
System.out.printf("\n%s",myString);
System.out.printf("\n%d",myInt);
System.out.printf("\n%f",myDouble);

System.out.printf("\nHello %12s",myString);

System.out.printf("\nYou have this much money %2f",myDouble);

System.out.printf("\nYou have this much money %,f",myDouble);



}

}