package AbstractFactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		if(shape == null){
	         return null;
	      }        
	      if(shape.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	      } else if(shape.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	      } else if(shape.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
		return null;

	}

}
