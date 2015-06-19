import java.util.*;
public class PascalTriangle {

	public int[] printRow(int row){
		int[] arr = new int[row+1];
		for(int i=0;i<=row;i++){
			arr[i]=fact(row)/fact(i)*fact(row-i);
		}
		return arr;
	}
	
	public int fact(int num){
		int n;
		if(num==1) return 1;
		else
		{
			n = num*fact(num-1);
		}
		return n;
	}
	
	public static void main(String[] args){
		PascalTriangle obj = new PascalTriangle();
		int[] arr=obj.printRow(3);
		for(int i=0;i<=3;i++){
			System.out.println(arr[i]);
		}
	}
}

