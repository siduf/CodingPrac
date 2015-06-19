import java.util.*;


public class Fourth {
	/*void spiralOrder(int[][] matrix)
	{
	     if(matrix.length == 0)
	         return;
	     // Initialize our four indexes
	     int top = 0;
	     int down = matrix.length - 1;
	     int left = 0;
	     int right = matrix[0].length - 1;
	 
	     while(true)
	     {
	         // Print top row
	         for(int j = left; j <= right; ++j) System.out.print(matrix[top][j] + " ");
	         top++;
	         if(top > down || left > right) break;
	         //Print the rightmost column
	         for(int i = top; i <= down; ++i) System.out.print(matrix[i][right] + " ");
	         right--;
	         if(top > down || left > right) break;
	         //Print the bottom row
	         for(int j = right; j >= left; --j) System.out.print(matrix[down][j] + " ");
	         down--;
	         if(top > down || left > right) break;
	         //Print the leftmost column
	         for(int i = down; i >= top; --i) System.out.print(matrix[i][left] + " ");
	         left++;
	         if(top > down || left > right) break;
	     }
	 }*/
	public ArrayList<Integer> spiralMatrix(int n)
	{
		ArrayList<Integer> B = new ArrayList<Integer>();
		
		
		
		
	return B;
	}
	
	/*public void printSpiral(int[][] A){
		int rows=A.length;
		int column = A[0].length;
		int T=0,B=rows-1,L=0,R=column-1;
		int dir=0;
		while(T<=B&&L<=R){
			if(dir==0){
			for(int i=L;i<=R;i++){
				System.out.print(A[T][i]+" ");
			}
			T++;
				dir=1;
			
			}
			else if(dir==1){
			for(int i=T;i<=B;i++){
				System.out.print(A[i][R]+" ");
			}
				R--;
                dir=2;
			
			}
			else if(dir==2){
			for(int i=R;i>=L;i--){
				System.out.print(A[B][i]+" ");
			}
				B--;
			    dir=3;
			
			}
			else if(dir==3){
				for(int i=B;i>=T;i--){
					System.out.print(A[i][L]+" ");
				}
					L++;
					dir=(dir+1)%4;
			}
			
		}
		
		
	}*/
	
	
	
	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A){
		int rows=A.size();
		int column = A.get(0).size();
		int T=0,B=rows-1,L=0,R=column-1;
		int dir=0;
		ArrayList<Integer> result = new ArrayList<Integer>();
		while(T<=B&&L<=R){
			if(dir==0){
			for(int i=L;i<=R;i++){
				//System.out.print(A.get(T).get(i)+" ");
				result.add(A.get(T).get(i));
			}
			T++;
				dir=1;
			
			}
			else if(dir==1){
			for(int i=T;i<=B;i++){
				//System.out.print(A.get(i).get(R)+" ");
				result.add(A.get(i).get(R));
			}
				R--;
                dir=2;
			
			}
			else if(dir==2){
			for(int i=R;i>=L;i--){
				//System.out.print(A.get(B).get(i)+" ");
				result.add(A.get(B).get(i));
			}
				B--;
			    dir=3;
			
			}
			else if(dir==3){
				for(int i=B;i>=T;i--){
					System.out.print(A.get(i).get(L)+" ");
					result.add(A.get(i).get(L));
				}
					L++;
					dir=(dir+1)%4;
			}
			
		}
		
		//return result;
		
		//Collections.reverse(result);
		return result;
	}
	
	
	public static void main(String[] args){
		Fourth obj = new Fourth();
        
       // System.out.println(arr[1][2]);
       /* int[][] b = new int[3][3];
        obj.spiralOrder(arr);*/
   /*ArrayList<Integer> B = new ArrayList<Integer>();
   B=obj.spiralMatrix(3);
   for(int i=0;i<B.size();i++){
	   System.out.print(B.get(i)+" ");
   }*/
		//obj.printSpiral(arr);
		
		List<ArrayList<Integer>> A ;
		//A.add(0,)
		
   
	}

}
