package course;

public class Circle {
	public static void main(String[] args) {
		// ����Բ��
		Point point2 = new Point(1,1);
		Circle circle = new Circle(point2, 1);
		boolean contain = circle.isContain(2, 2);
		System.out.println(contain);
		System.out.println(circle.area());
	}
	public Circle() {

	}
	public Circle(Point p,int r) {
		this.point = p;
		this.r = r;
	}
	// ����Բ�����
	public double area() {
		return Math.PI*r*r;
	}

	// ���㵱ǰͼ���Ƿ����ָ���ĵ�?
	// ����true�Ļ����ǰ���(Բ�Ϻ�Բ��)
	public boolean isContain(int x,int y) {
		return this.point.distance(x, y) <= r;
	}


	Point point;

	int r;

}
