package zkouska;

public class Periferie {
	private String name;

	public Periferie(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return ", periphery name = " + name;
	}

}