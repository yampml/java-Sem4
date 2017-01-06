
public class _7_StringProcessing_Again {

	public static int countJava(String s) {
		int ans = 0;
		int i = 0;
		while (s.indexOf("Java", i) != -1) {
			ans++;
			i = s.indexOf("Java", i) + 4;
		}
		return ans;
	}

	public static int lastJavaIndex(String s) {
		return s.lastIndexOf("Java");
	}

	public static String replaceJava(String s) {
		return s.replaceAll("Java", "java");
	}

	public static int countNumberChar(String s) {
		int ans = 0;
		for(int i = 0; i<s.length(); i++)
		{
			if(s.charAt(i) >= '0' && s.charAt(i)<='9') ans++;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java ha J55ava really Java 69 55 jav Java java";
		// String str = "Fake jaba";

		System.out.println("Số từ \"Java\" có trong chuối: " + countJava(str));

		if (lastJavaIndex(str) != -1)
			System.out.println("Vị trí cuối cùng của từ \"Java\" trong chuỗi là " + lastJavaIndex(str));
		else
			System.out.println("Không có từ Java trong chuỗi");

		System.out.println("Chuỗi sau khi replace: " + replaceJava(str));
		
		System.out.println("Số kí tự là chữ số trong chuỗi: " + countNumberChar(str));
	}

}
