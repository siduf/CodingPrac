import java.util.*;
public class Third {
int sum=0,product=1;
public ArrayList<Integer> repeatingNum(ArrayList<Integer> A){
	int n=A.size();
	ArrayList<Integer> B = new ArrayList<Integer>();
	double x=0,y=0,sum=0,product=1;
	for(int i=0;i<A.size();i++){
		sum=sum+A.get(i);
	}
for(int i=0;i<A.size();i++){
		product=product*A.get(i);
	}
	x =  ((n*(n+1))/2 - sum)/(1 - (double)product/fact(n));
	y=(x*product)/fact(n);
    B.add((int)y);
    B.add((int) x);
	return B;
}
public int fact(int n){
	int factorial=1;
	for(int i=2;i<=n;i++){
		factorial=factorial*i;
	}
	return factorial;
}
public static void main(String[] args){
	long startTime = System.currentTimeMillis();
	
	Third obj = new Third();
	ArrayList<Integer> A = new ArrayList<Integer>();
	A.add(1);
	A.add(2);
	A.add(6);
	A.add(3);
	A.add(4);
	A.add(3);
	//A.add(3);
	 ArrayList<Integer> B = obj.repeatingNum(A);
	 //obj.fact(A.size());
	 //System.out.println(obj.fact(A.size()));
	 for(int i=0;i<B.size();i++){
		 System.out.print(B.get(i)+" ");
	 }
	 System.out.println(" ");
	
	 long endTime   = System.currentTimeMillis();
	 long totaltime = endTime - startTime;
	 System.out.println("Running time is :"+totaltime+" milliseconds");
}
}
