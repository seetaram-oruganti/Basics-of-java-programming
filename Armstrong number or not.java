import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
           int  p=0;

int i=n;
final int j=10;
int k=0;


i=n;

while(i>0)
{
  k++;
  i=i/j;
}

i=n;
	while(n>0)
  {
      i=i%j;
      
      n=n/j;
      
      i=n;
      
      
  	  p=(int)Math.pow(i,k)+p;
  		
  
  }
if(p==n)
  
	System.out.print(1);
else
  System.out.print(0);
  
