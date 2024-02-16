package Day08.Ex02_Shape;

public class Point {
	
	// 멤버변수 x, y
	int x;
	int y;

	// alt + shift + s => Generate Constructor Using Field...
	// 기본 생성자
	public Point() {
		
	}

	// 매개변수가 있는 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// alt + shift + s => Generate toString()...
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}