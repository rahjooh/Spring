package xmlstrategy;

public class Member {
	private String name;
	private String family;
	
	
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", family=" + family + "]";
	}
	
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
