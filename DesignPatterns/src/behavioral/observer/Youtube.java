package behavioral.observer;

public class Youtube {

	public static void main(String[] args) {
		
		Channel ibkumar = new Channel();
		
		
		Subscriber sub1 = new Subscriber("Rohit");
		Subscriber sub2 = new Subscriber("Mohit");
		
		ibkumar.subscribe(sub1);
		ibkumar.subscribe(sub2);
		
		sub1.subscribeChannel(ibkumar);
		sub2.subscribeChannel(ibkumar);
		
		ibkumar.upload("How to learn design pattern?");
	

	}

}
