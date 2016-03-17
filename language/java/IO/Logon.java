import java.io.*;
import java.util.*;

public class Logon implements Serializable{
	private Date date = new Date();
	private String name;
	private transient String password;
	public Logon(String name, String password){
		this.name = name;
		this.password = password;
	}
	public String toString(){
		return "logon info:\n" 
		+ "name: " + name + "\n"
		+ "date: " + date + "\n"
		+ "password: " + password;
	}
	
	
	public static void main(String[] args) throws Exception{
		Logon a = new Logon("tanc", "123456");
		System.out.println(a + "\n");
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Logon.txt"));
		out.writeObject(a);
		out.close();
		
		for(int i=1000; i>0; i--){}
		System.out.println("-----------------------");
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Logon.txt"));
		a = (Logon)in.readObject();
		System.out.println(a + "\n");
	}
}