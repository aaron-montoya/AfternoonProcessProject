package process.model;

public class PlayDohNoodle
{
	private int length;
	
	public PlayDohNoodle()
	{
		this.length = 10;
	}
	
	public PlayDohNoodle(int length)
	{
		this.length = length;
	}
	
	public String toString()
	{
		String description = "I am a noodle, I am " + length + " long";
		return description;
	}
}
