
public class _4_LastMinElem {

	public static void main(String[] args) {
		
		int a[] = {1,2,4,6,3,7,8,2,6,9,1,2,5};
		int index = 0, min = a[0];
		
		for(int i = 1; i < a.length; i++){
			if(a[i] <= min){
				index = i;
				min = a[i];
			}
		}
		
		System.out.println("Giá trị nhỏ nhất cuối cùng bằng " + min + " tại vị trí a[" + index + "]");
		
	}
}
