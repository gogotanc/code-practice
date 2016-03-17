public class Vampire{
	public static void main(String[] args){
		
		int pro = 0;
		
		for(int i=10; i<100; i++){
			for(int j=10; j<100; j++)
			{
				pro = i * j;
				
				if(pro < 1000 || pro > 9999)
					continue;
				
				String stri = Integer.valueOf(i).toString();
				String strj = Integer.valueOf(j).toString();
				String strpro = Integer.valueOf(pro).toString();
				
				if(strpro.contains(stri) && strpro.contains(strj))
					if(strpro.length() == (stri.length()+strj.length())) 
						if(!strpro.endsWith("00"))
						System.out.println(strpro + " = " + stri + " * " + strj );
			}
		}
		
		
		
		
		
		
		
	}
}