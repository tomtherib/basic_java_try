package zkouska;

public class Laptop extends Device{
	
	private Monitors monitor;
	
	public Laptop(Integer id, String name, Integer cpu, Integer ram, Monitors monitor) {
		super(id, name, cpu, ram);
		this.setMonitor(monitor);
		// TODO Auto-generated constructor stub
	}
	public Monitors getMonitor() {
		// TODO Auto-generated method stub
		return monitor;
	}
	public void setMonitor(Monitors m) {
		// TODO Auto-generated method stub
		monitor = m;
	}

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public Integer getCpu() {
		// TODO Auto-generated method stub
		return super.getCpu();
	}

	@Override
	public void setCpu(Integer cpu) {
		// TODO Auto-generated method stub
		super.setCpu(cpu);
	}

	@Override
	public Integer getRam() {
		// TODO Auto-generated method stub
		return super.getRam();
	}

	@Override
	public void setRam(Integer ram) {
		// TODO Auto-generated method stub
		super.setRam(ram);
	}
	@Override
	public String toString() {
		return "\n" + "Laptop" + " - ID = " + this.getId() + ", name = " + this.getName() + ", cpu = " + this.getCpu() + ", ram = " + this.getRam() + ", " + monitor;
	}
	
}
