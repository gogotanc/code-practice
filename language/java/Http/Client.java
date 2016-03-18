import java.io.*;
import java.net.*;

public class Client{
	public static void main(String[] args) throws Exception{

		byte[] buf = new byte[1024];

		Socket s = new Socket("127.0.0.1", 8080);

		OutputStream out = s.getOutputStream();
		out.write("client visit".getBytes());

		InputStream in = s.getInputStream();

		int len = in.read(buf);

		for(int i=0; i<len; i++)
			System.out.print((char)buf[i]);

		s.close();
	}
}