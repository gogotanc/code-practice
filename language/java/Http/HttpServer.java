import java.io.*;
import java.net.*;

public class HttpServer {

	private static ServerSocket server = null;
	private static Socket socket = null;
	private static Request request = null;
	private static Response response = null;

	public static void main(String[] args) {
		try {

			server = new ServerSocket(8080, 0, InetAddress.getByName("127.0.0.1"));
			//server = new ServerSocket(8080);
			while(true){
				socket = server.accept();

				new Thread(new Runnable(){
					public void run(){
						try{
							request = new Request(socket.getInputStream());
							response = new Response(socket.getOutputStream());
						} catch(Exception e){
							e.printStackTrace();
						}
						request.parse();
						response.execute();
					}
				}).start();
			}


		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(socket != null){
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(server != null){
				try {
					server.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}