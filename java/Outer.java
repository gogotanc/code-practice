public class Outer{
	
	private int data = 10;
	
	public Inner getInner(){
		return new InnerImpl();
	}
	
	class InnerImpl implements Inner{
		public int getData(){
			return data;
		}
	}
	
	public static void main(String[] args){
		Outer out = new Outer();
		Inner in = out.getInner();
		System.out.println(in.getData());
	}
}

interface Inner{
	public int getData();
}