package behavioral.strategy;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		
		Context context = new Context(new OperationAdd());		
	      System.out.println("12 + 5 = " + context.executeStrategy(12, 5));

	      context = new Context(new OperationSubtract());		
	      System.out.println("12 - 5 = " + context.executeStrategy(12, 5));
	}

}
