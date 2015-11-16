import java.net.*;
import java.io.*;

public class Response{
	
	private OutputStream out;
	private byte[] buf = new byte[2048];
	private StringBuffer context;
	
	public Response(OutputStream out){
		this.out = out;
		context = new StringBuffer();
	}
	
	public void execute(){
		try{
			out.write("ack".getBytes());
		} catch(Exception e){
			System.out.println("write failed");
		} finally{
			if(out != null){
				try{
					out.close();
				} catch(Exception e){
					System.out.println("close failed");
				}
			}
		}
	}
}