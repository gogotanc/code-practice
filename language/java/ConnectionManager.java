public class ConnectionManager{
	private static Connection connection = Connection.getInstance();
	public static Connection getConnection(){
		return connection;
	}
	public static void main(String[] args){
		//Connection conn = ConnectionManager.getConnection();
		Connection conn = Connection.getInstance();
		conn.show();
	}
}

class Connection{
	private Connection(){}
	
	protected static Connection getInstance(){
		return new Connection();
	}
	
	public void show(){
		System.out.println("connected");
	}
}