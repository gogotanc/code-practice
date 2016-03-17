public class ExceptionTest{
	public static void main(String[] args){
		try{
			// H h = new H();
			// h.event();
			Hi hi = new Hi();
			hi.event();
		} catch(Exception e){
			System.out.println("Catch it");
		}
	}

	public static void f() throws SimpleException{
		System.out.println("f() throws a simpleexception.");
		throw new SimpleException("hahahahhaha");
	}
}

class SimpleException extends Exception{
	SimpleException(){}
	SimpleException(String msg){ super(msg); }
}

abstract class H implements Inss{
	H() throws SimpleException{}
	public void event() throws SimpleException{
		System.out.println("nothing wrong");
	}
}

class Hi extends H{
	Hi() throws Exception{}
	public void event() throws SimpleException{
		System.out.println("Hi nothing wrong");
	}
}

interface Inss{
	public void event() throws SimpleException;
}