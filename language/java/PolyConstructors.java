public class PolyConstructors{
	public static void main(String[] args){
		new RoundGlyph(5);
	}
}

class Glyph{

	Glyph(){
		System.out.println("before Glyph.draw()");
		draw();
		System.out.println("after Glyph.draw()");
	}

	void draw(){
		System.out.println("Glyph.draw()");
	}
}

class RoundGlyph extends Glyph{

	private int data = 1;

	RoundGlyph(int i){
		data = i;
		System.out.println("RoundGlyph(), data = " + data);
	}

	void draw(){
		System.out.println("RoundGlyph.draw(), data = " + data);
	}
}