import java.io.*;

public class Echo{
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		while((s=in.readLine()) != null && s.length()!=0){
			try{
				int i = Integer.parseInt(s);
				System.out.println(i);
			} catch(Exception e){
				System.out.println("请输入合法数字");
				continue;
			}
		}
		in.close();
	}
}