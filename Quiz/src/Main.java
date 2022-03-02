import java.util.ArrayList;
import java.util.Scanner;

import week4.Range;

public class Main {
	Scanner sc = new Scanner(System.in);
	ArrayList<Branch> branchList = new ArrayList<>();
	public Main() {
		setData();
		menu();
	}
	
	private void setData() {
		branchList.add(new Stationary("Scranton", "Philadelphia", 5, "parmesan", 2.8, false));	
	}
	
	private void viewBranches() {
		for (Branch b : branchList) {
			if(b.getType().equals(Stationary.class)) {
			System.out.println("================================================================================");
			System.out.println("|Name		|Location		|Budget($)		|Employee	|Total Revenue ($)	|");
			System.out.println("================================================================================");
			System.out.println("|"+ b.getName()+"|"+b.getLocation()+"|"+b.getBudget()+"|"+ b.getEmployee()+"|"+b.getRevenue());			
		}else {
			System.out.println("================================================================================");
			System.out.println("|Name		|Location		|Budget($)		|Employee	|Total Sold ($)	|");
			System.out.println("================================================================================");
			System.out.println("|"+ b.getName()+"|"+b.getLocation()+"|"+b.getBudget()+"|"+ b.getEmployee()+"|"+b.getItemSold());	
		}
	}
}
	
	private void menu() {
		Integer choose = 0;
		System.out.println("Zunder Ziflin");
		System.out.println("================");
		System.out.println("1. View Branches");
		System.out.println("2. Create a new Branches");
		System.out.println("3. Run Branches");
		System.out.println("4. Increase Budget");
		System.out.println("5. Exit");
		do {
			System.out.println("Enter a Menu: ");
			choose = sc.nextInt();sc.nextLine();
			}while (choose <1 || choose >5);
		switch (choose) {
		case 1:viewBranches();
			break;
		case 2:
			break;
		case 3: 
			break;
		case 4: 
			break;
		default:
			break;
		}
	}
	
	public static void Main(String[] args) {
		new Main();
	}
}
