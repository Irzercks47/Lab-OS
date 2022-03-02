
public abstract class Branch {
	private String type,name,location;
	private int employee,upBudget;

	public Branch(String type, String name, String location, int employee, int upBudget) {
		super();
		this.type = type;
		this.name = name;
		this.location = location;
		this.employee = employee;
		this.upBudget = upBudget;
		// TODO Auto-generated constructor stub
	}


	public abstract int getBudget();
	public abstract int getRevenue();
	public abstract int getItemSold();
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getEmployee() {
		return employee;
	}

	public void setEmployee(int employee) {
		this.employee = employee;
	}

	public int getUpBudget() {
		return upBudget;
	}

	public void setUpBudget(int upBudget) {
		this.upBudget = upBudget;
	}

	
}
