class Rectangle
{
	float length;
	float breadth;
	void setData(float a, float b)
	{
		length = a;
		breadth = b;
	}
	float getArea()
	{
		return length * breadth;
	}
}
class RectangleArea
{
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		Rectangle r3 = new Rectangle();
		r1.setData(12.4f,13f);
		r2.setData(10.5f,9f);
		r3.setData(13f,14f);
		float area1 = r1.getArea();
		float area2 = r2.getArea();
		float area3 = r3.getArea();
		System.out.println("Area of R1 = "+area1);
		System.out.println("Area of R2 = "+area2);
		System.out.println("Area of R3 = "+area3);
	}
}