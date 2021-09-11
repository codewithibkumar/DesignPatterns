package behavioral.observer;

public interface Subject {
	public void subscribe(Subscriber sub);
	void unsubscribe(Subscriber sub);
	void upload(String title);
	public void notifySubscribers(String videoTitle);

}
