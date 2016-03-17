/* 
import java.io.*;

public class Demo2{
	public static void main(String[] args) throws Exception{
		
	}
} 
*/
import java.io.*;
import java.util.*;

public class Demo2{
	public static void main(String[] args) throws Exception{
		LinkedList<String> list = new LinkedList<String>();
		BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
		String line;
		while((line=reader.readLine()) != null){
			list.add(line);
		}
		System.out.println(list);
		StringBuilder buf = new StringBuilder();
		buf.append("[");
		Iterator<String> iterator = list.descendingIterator();
		while(iterator.hasNext()){
			buf.append(iterator.next() + ", ");
		}
		System.out.println( buf.substring(0, buf.lastIndexOf(", ")) + "]" );
	}
}