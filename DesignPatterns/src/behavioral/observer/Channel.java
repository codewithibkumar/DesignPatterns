package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

	private List<Subscriber> subsList = new ArrayList<>();
	private String title;
	
	public void subscribe(Subscriber subscriber)
	{
				subsList.add(subscriber);
	}
	public void unsubscribe(Subscriber subscriber)
	{
			    subsList.remove(subscriber);
	}
	public void notifySubscribers(String videoTitle)
	{
		for(Subscriber sub: subsList)
			sub.update(videoTitle,sub.getName());
	}
	public void upload(String title)
	{
		this.title = title;
		notifySubscribers(title);
	}

}
