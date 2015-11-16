import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {

	public static void main(String[] args) {

		ServerSocket server = null;
		Socket socket = null;
		Request request = null;

		try {
			
			server = new ServerSocket(8080, 0, InetAddress.getByName("127.0.0.1"));
			//server = new ServerSocket(8080);
			socket = server.accept();

			request = new Request(socket.getInputStream());
			
		
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(request != null){
				try {
					request.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}