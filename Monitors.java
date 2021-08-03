package zkouska;

public class Monitors {
	private String resolution;
	private String type;
	
	public Monitors(String resolution, String type) {
		super();
		this.resolution = resolution;
		this.type = type;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return " monitor resolution = " + resolution + ", monitor type = " + type;
	}
}
