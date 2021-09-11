package creational.abstractfactory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		
		  AbstractFactory shapeFactory =	FactoryProducer.getFactory(false);
		
		  
	      //get an object of Circle and call its draw method.
	      Shape shape1 = shapeFactory.getShape("CIRCLE");

	      //call draw method of Circle
	      shape1.draw();

	      //get an object of Rectangle and call its draw method.
	      Shape shape2 = shapeFactory.getShape("RECTANGLE");

	      //call draw method of Rectangle
	      shape2.draw();

	      //get an object of Square and call its draw method.
	      Shape shape3 = shapeFactory.getShape("SQUARE");

	      //call draw method of square
	      shape3.draw();
	      
		  AbstractFactory shapeFactory1 =	FactoryProducer.getFactory(true);
		  Shape shape4 = shapeFactory1.getShape("RECTANGLE");
		  shape4.draw();
		  
	      

	}

}
