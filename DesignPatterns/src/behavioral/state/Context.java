package behavioral.state;

public class Context {
	private State state;
	
	Context()
	{
		state=null;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	

}
