import java.util.*;

public class Dataonly{
	int i;
	double d;
	float f;
	char c;
	byte b;
	short s;
	long l;
	boolean boo;
	static int data = 46;

	public static void main(String[] args){

		int i = 0;
		int j = 100;
		int l = 100;

		outer:
		while(true){
			System.out.println("outer while loop");
			while(true){
				i++;
				if((i%2) == 1){
					System.out.println("continue");
					continue outer;
				}
				System.out.println(" i = " + i);
				if(i == 100){
					return;
				}
			}
		}


/* 		Dataonly data = new Dataonly();
		Dataonly data1 = new Dataonly();

		System.out.println(System.getProperty("user.name"));

		Random random = new Random();
		int i = random.nextInt(100);
		System.out.println(i);
		i = random.nextInt(100);
		System.out.println(i);

		int d = 0x2f;
		System.out.println(d);
		System.out.println(Integer.toBinaryString(d)); */
		/*
		System.out.println(data.data);
		data1.data++;
		System.out.println(Dataonly.data); */
		/*
		int iii;
		System.out.println(iii);
		System.out.println(data.i);
		System.out.println(data.d);
		System.out.println(data.f);
		System.out.println(data.c);
		System.out.println(data.b);
		System.out.println(data.s);
		System.out.println(data.l);
		System.out.println(data.boo); */
	}
}