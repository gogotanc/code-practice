public class Demo{
	public static void main(String[] args){
		Class c = null;
		try{
			c = Class.forName("java.util.TreeMap");
		} catch(Exception e){
			e.printStackTrace();
		}
		show(c);
	}

	public static void show(Class c){
		System.out.println(c.getName());
		Class cc = c.getSuperclass();
		if(cc == null)
			return;
		show(cc);
	}
}