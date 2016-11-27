package Shapes;

public class rectangle {
private int width1;
private int height1;

public rectangle(int height, int width){
	height1 = height;
	width1 = width;
}

public int getArea() {
	return width1*height1;
}
}
