package step4;

public class School {
	private String name;
	private Bus bus;
	public School(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setBus(Bus bus) {
		this.bus=bus;
	}
	public Bus getBus() {
		return bus;
	}
}
