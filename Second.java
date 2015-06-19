import java.util.*;
public class Second {
	int carry=1;
public ArrayList<Integer> onePlus(ArrayList<Integer> A){
	//int carry =1;
	ArrayList<Integer> B = new ArrayList<Integer>();
	
		if(A.get(A.size()-1)+1<10) 
		{
			B.add(A.get(A.size()-1)+1);
		    for(int i=A.size()-2;i>=0;i--){
			 B.add(A.get(i));
		 }
		}
		else
		{
			for(int i=A.size()-1;i>0;i--){
				int add = A.get(i)+carry;
				int val=add%10;
				B.add(val);
				carry=add/10;
			}
				int add1 = A.get(0)+carry;
				B.add(add1);
				//val=A.get(i)+carry;
				//B.add(add);
			//}
		}
	
	Collections.reverse(B);
	return B;
}

public static void main(String[] args){
	Second obj = new Second();
	ArrayList<Integer> A = new ArrayList<Integer>();
	A.add(2);
	A.add(5);
	A.add(6);
	A.add(8);
	A.add(6);
	A.add(1);
	A.add(2);
	A.add(4);
	A.add(5);
	ArrayList<Integer>  B = obj.onePlus(A);
	for(int i=0;i<B.size();i++){
		System.out.print(B.get(i));
	}
}
	
}
