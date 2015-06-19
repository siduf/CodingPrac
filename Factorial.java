public class Factorial{

public int fact(int num)
{
int n;

if(num==1)
   return 1;

else
{
n=num*fact(num-1);
}

return n;
}

public static void main(String[] args){
Factorial obj = new Factorial();
System.out.println(obj.fact(4));
}

}
