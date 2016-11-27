import Shapes.rectangle;
import Shapes.square;
public class Driver {
	public static void main(String[] args){
square s1 = new square(100);
System.out.println(s1.getArea());

rectangle r1 = new rectangle(50, 80);
System.out.println(r1.getArea());
}
}
