
public class Stationary extends Branch {
	private int totalRevenue;
	public Stationary(String type,String name, String location, int employee, int upBudget, int revenue) {
		super(type, name, location, employee, upBudget);
		// TODO Auto-generated constructor stub
		this.totalRevenue = revenue;
	}

	public int getTotalRevenue() {
		return totalRevenue;
	}

	public void setTotalRevenue(int totalRevenue) {
		this.totalRevenue = totalRevenue;
	}

	@Override
	public int getBudget() {
		// TODO Auto-generated method stub
		return ((40 - getEmployee())*40000);
	}

	@Override
	public int getRevenue() {
		// TODO Auto-generated method stub
		return (int)((getBudget()*0.2 - 50000)*getEmployee());
	}

	@Override
	public int getItemSold() {
		// TODO Auto-generated method stub
		return 0;
	}

}
