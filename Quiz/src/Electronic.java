public class Electronic extends Branch {
	private int totalSold;
	public Electronic(String type,String name, String location, int employee, int upBudget, int sold) {
		super(type, name, location, employee, budget);
		this.totalSold = sold;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getBudget() {
		// TODO Auto-generated method stub
		return ((40 - getEmployee())*60000);
	}

	public int getTotalSold() {
		return totalSold;
	}

	public void setTotalSold(int totalSold) {
		this.totalSold = totalSold;
	}

	@Override
	public int getRevenue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getItemSold() {
		// TODO Auto-generated method stub
		return (int) ((getBudget()*0.4 - 70000)*getEmployee()/700);
	}

}
