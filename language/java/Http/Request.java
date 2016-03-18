import java.net.*;
import java.io.*;

public class Request{

	private InputStream in;
	private byte[] buf = new byte[2048];
	private StringBuffer context;

	public Request(InputStream in){
		this.in = in;
		context = new StringBuffer();
	}

	public void parse(){
		init();
		System.out.println(context.toString());
	}

	public void init(){
		try{
			int len = in.read(buf);
			for(int i=0; i<len; i++)
				context.append((char)buf[i]);
		} catch(Exception e){
			System.out.print("read failed");
		} finally{
			if(in != null){
				try{
					in.close();
				} catch(Exception e){
					System.out.print("close failed");
				}
			}
		}
	}
}