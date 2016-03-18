public class Light implements Runnable{

	private static int count = 1;
	private final int id = count++;
	private int num;

	public Light(int num){
		this.num = num;
	}

	public void run(){
		Thread.currentThread().setPriority(id);
		while(num-- > 0){
			System.out.println( id + ": " + num);
		}
	}
}