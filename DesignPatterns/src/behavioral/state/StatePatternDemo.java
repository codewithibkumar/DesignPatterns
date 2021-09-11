package behavioral.state;

public class StatePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Context context = new Context();
		
		StartState start = new StartState();
		start.doAction(context);
		
		System.out.println(context.getState().toString());
		
		StopState stop = new StopState();
		stop.doAction(context);
		
		System.out.println(context.getState().toString());
	}

}
