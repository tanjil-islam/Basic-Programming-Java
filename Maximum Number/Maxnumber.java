import java.util.Scanner;

public class Maxnumber {
   
    public static void main(String[]args){
  int num1,num2,num3,num4;
  System.out.println("enter four numbers randomly");
  Scanner m=new Scanner(System.in);
  num1=m.nextInt();
  num2=m.nextInt();
  num3=m.nextInt();
 num4=m.nextInt();
 

 
  if(num3>num1){
    if(num3>num2){
        if (num3>num4)
        {System.out.println( "num3 is maximum " + num3);}

        else{System.out.println("num4 is maximum" + num4);}
    }

    else{System.out.println("num2 is maximum"  + num2);}
}


 
else if(num2>num1)  {
  
    if (num2>num3){
  
  
      if (num2>num4)
            
   
          
                   
                   {System.out.println("num2 is maximum" + num2);}
                   else{System.out.println("num4 is maximum" + num4);}
   
  }
  

  else{System.out.println("num3 is maximum " + num3);}

  
  }
  
 
else if (num1>num2){
  
  
     if (num1>num3){
           
  
         if (num1>num4)
                  
                  {System.out.println("num1 is maximum"  + num1);}
                  else{System.out.println("num4 is maximum"  + num4);}
  
     }
                 
               else{System.out.println("num4 is maximum" + num4);}

     
    }
            

 
 else{System.out.println("num4 is maximum" + num4);} 

  
  
    }
  
     
}