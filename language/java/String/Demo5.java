public class Demo5 {
	public static void main(String[] args) {
		String str = new String("abc");
		String ss = "def";
		change(str,ss);
		System.out.println(str + "..." + ss);
	}

	public static void change(String s1, String s2) {
		s1 = "def";
		s2 = "abc";
	}
}
