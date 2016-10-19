abstract class Shape{
	abstract void draw();
}

class Line extends Shape{
	public void draw(){

	}
}

class Rectangle extends Line{
	public void draw(){

	}
}

class Cube extends Line{
	public void draw(){

	}
}

class ShapeMain{
	public static void main(String args[]){
		Shape s[]=new Shape[3];
		s[0]=new Line();
		s[1]=new Rectangle();
		s[2]=new Cube();
		for(int i=0;i<s.length;i++){
			s[i].draw();
		}
		System.out.println("Success");
	}
}