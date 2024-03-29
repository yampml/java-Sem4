
public class Point2D {
	private float x, y;

	public Point2D() {
		this.x = 0;
		this.y = 0;
	}

	public Point2D(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void move(float dx, float dy) {
		this.x += dx;
		this.y += dy;
	}

	public float distance(Point2D p) {
		float ans = (float) Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
		return ans;
	}

	public void display() {
		System.out.println("(" + x + ";" + y + ")");
	}

	public static void main(String[] args) {
		Point2D A = new Point2D();
		Point2D B = new Point2D(3, 4);

		System.out.println("Tọa độ điểm A: ");
		A.display();
		System.out.println("Tọa độ điểm B: ");
		B.display();

		A.move(4, 2);

		System.out.println("Tọa độ mới của A: ");
		A.display();
		double d = A.distance(B);
		System.out.println("Khoảng các từ A đến B là: " + String.format("%.2f", d));
	}
	
}
