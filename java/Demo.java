public class Demo{

	public static void run(Cycle c){
		c.ride();
		// c.show();
	}

	public static void main(String[] args){
		Bicycle b = new Bicycle();
		Unicycle u = new Unicycle();
		Tricycle t = new Tricycle();
		run(b);
		run(u);
		run(t);
		b.show();
	}
}

class Cycle{
	
	private void show(){
		System.out.println("Cycle show");
	}
	
	public void ride(){
		System.out.println("Cycle ride");
	}
}

class Bicycle extends Cycle{
	public void show(){
		System.out.println("Bicycle show");
	}
}

class Unicycle extends Cycle{
	
}

class Tricycle extends Cycle{
	public void ride(){
		System.out.println("Tricycle ride");
	}
}