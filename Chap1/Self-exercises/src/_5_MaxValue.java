
public class _5_MaxValue {

	public static int findMax(int a, int b, int c){
		if(a<b) a = b;
		if(a<c) a = c;
		return a;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1,
			b = 2,
			c = 3;
		System.out.println(findMax(a,b,c));
		
	}

}
