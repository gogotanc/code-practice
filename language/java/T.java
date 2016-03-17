class T{
	String str;
	
	public T(String str){
		this.str = str;
	}
	
	static{
		System.out.println("lalalala");
	}
	
	public static void f(String... strs){
		for(String str : strs){
			System.out.println(str + "...");
		}
	}
	
	public static void f(float f, String... strs){
		for(String str : strs){
			System.out.println(str + "...");
		}
	}
	
	public static void i(Integer... ii){
		for(int i : ii){
			System.out.println(i + "...");
		}
	}
	
	public static void main(String... args){
		for(String str : args)
			System.out.println(str);
		
		Type type = Type.A;
		
		R r = new R();
		r.b = 10;
		r.show();
 	}
}

enum Type{
	A, B, C
}