/*Find out the subset of an array of continuous positive 
numbers from a larger array whose sum of of the elements is larger in comparison to
other subset.*/
import java.util.*;
public class Fifth {
public int maxset(ArrayList<Integer> A){
	ArrayList<Integer> result = new ArrayList<Integer>();
	int max_so_far=0,max_end_here=0,start=0,j=0;
	for(int i=0;i<A.size();i++){
		max_end_here=max_end_here+A.get(i);
		if(max_end_here<0)
			max_end_here=0;
		else if(max_so_far<max_end_here){
			result.add(A.get(i));
			
		
			//result.add(A.get(j));
			max_so_far=max_end_here;
		
		}
		}
	//Collections.reverse(result);
	//return result;
	return max_so_far;
}
public static void main(String[] args){
	ArrayList<Integer> A= new ArrayList<Integer>();
	A.add(-2);
	A.add(-3);
	A.add(4);
	//A.add(-1);
	A.add(-2);
	A.add(1);
	A.add(5);
	A.add(-3);
 Fifth obj = new Fifth();
 System.out.println(obj.maxset(A));
 /*ArrayList<Integer> B = obj.maxset(A);
	for(int  i=0;i<B.size();i++){
		System.out.print(B.get(i)+" ");
	}*/
	}
}
