package behavioral.observer;

public interface Observer {
	void update(String vidName, String title);

	void subscribeChannel(Channel ch);
}
