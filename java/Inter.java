public interface Inter{
	int i = 10;
}

class ABC implements Inter{
	public static void main(String[] args){
		ABC a = new ABC();
		a.i = 100;
	}
}