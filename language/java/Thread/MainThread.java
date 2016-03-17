public class MainThread{
	public static void main(String[] a){
		for(int i=5; i>0; i--){
			new Thread(new Light(100)).start();
		}
	}
}