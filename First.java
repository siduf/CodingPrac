import java.util.*;
public class First {
public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int n){
ArrayList<Integer> B = new ArrayList<Integer>();

for(int i=0;i<A.size();i++){
	B.add(A.get(((i+n)%A.size())));
}
return B;
}

public static void main(String[] args){
	ArrayList<Integer> A = new ArrayList<Integer>();
	A.add(1);
	A.add(2);
	A.add(3);
	A.add(4);
	First obj = new First();
	 ArrayList<Integer> B = obj.rotateArray(A, 2);
	 
	 for(int i=0;i<B.size();i++){
		 System.out.print(B.get(i) +" ");
	 }
	
}
}