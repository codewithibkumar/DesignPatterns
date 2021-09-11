package behavioral.observer;

public class Subscriber {

	private String name;
	private Channel channel;
	
	public Subscriber(String name)
	{
		this.name = name;
	}
	public void update(String videoName, String subName)
	{
		System.out.println("Hey "+subName+ " "+	videoName +" Video uploaded");
	}
	public void subscribeChannel(Channel channel)
	{
		this.channel = channel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Channel getChannel() {
		return channel;
	}
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	
	
}
