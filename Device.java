package zkouska;

public class Device {
	private Integer id;
	private String name;
	private Integer cpu;
	private Integer ram;
	
	public Device(Integer id, String name, Integer cpu, Integer ram) {
		super();
		this.id = id;
		this.name = name;
		this.cpu = cpu;
		this.ram = ram;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCpu() {
		return cpu;
	}
	public void setCpu(Integer cpu) {
		this.cpu = cpu;
	}
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "\n" + "Device - ID = " + id + ", name = " + name + ", cpu = " + cpu + ", ram = " + ram;
	}
}
