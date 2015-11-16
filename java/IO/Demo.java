import java.io.*;

public class Demo{
	public static void main(String[] args) throws Exception{
		System.out.println(read("Demo.java"));
	}
	
	public static String read(String name) throws Exception{
		BufferedReader reader = new BufferedReader(new FileReader(name));
		StringBuilder buf = new StringBuilder();
		String s;
		while((s=reader.readLine()) != null){
			buf.append(s + "\n");
		}
		reader.close();
		return buf.toString();
	}
}