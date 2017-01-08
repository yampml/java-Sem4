import java.util.Arrays;
import java.util.Comparator;

public class RectangleSort {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle vec[];
		vec = new Rectangle[10];
		
		double randomWidth = 0, randomHeight = 0;
		for(int i = 0; i < vec.length; i++){
		
			randomWidth =(Math.random() * 100);
			randomHeight =(Math.random() * 100);
			vec[i] = new Rectangle(randomWidth, randomHeight);
		
		}
		
		Arrays.sort(vec, new Comparator<Rectangle>() {

			@Override
			public int compare(Rectangle o1, Rectangle o2) {
				// TODO Auto-generated method stub
				return (int) (o1.area()-o2.area());
			}
		});
		
		for(int i = 0; i <vec.length; i++){
			System.out.println("Diện tích HCN " + i + " = " + Math.round(vec[i].area()));
		}
	}
}

abstract class Shape{
	abstract double area();
	
	public String toString(){
		return "area = " + area();
		
	}
}

class Rectangle extends Shape{
	
	double width;
	double height;
	
	
	public Rectangle(double randomWidth, double randomHeight) {
		this.width = randomWidth;
		this.height = randomHeight;
	}

	@Override
	double area() {
		return width*height;
	}
	
}
