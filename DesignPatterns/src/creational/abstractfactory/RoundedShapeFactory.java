package creational.abstractfactory;

public class RoundedShapeFactory implements AbstractFactory{

	public Shape getShape(String shapeType)
	{
		if(shapeType==null)
			return null;
		else if(shapeType.equalsIgnoreCase("SQUARE"))
			return new RoundedSquare();
		else if(shapeType.equalsIgnoreCase("RECTANGLE"))
			return new RoundedRectangle();
		return null;
	}
}
