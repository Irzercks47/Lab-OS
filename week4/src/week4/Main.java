package week4;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	Scanner sc = new Scanner(System.in);
	Vector<String> nameList = new Vector<String>();
	Vector<Hero> heroList = new Vector<Hero>();
	
	public main() {
		//to do
		setData();
		menu();
	}
	
	private void setData() {
		nameList.add("alberic");
		nameList.add("andrew");
		nameList.add("kimberly");
//		Hero h = new Hero("Drowranger",1000,100,50);
//		heroList.add(new Hero("Invoker", 1500,200,100));
		heroList.add(new Range("Drowranger",1000,100,50,5));
		heroList.add(new Wizard("Invoker",1500,200,100,20));
	}
	
	private void menu() {
		Integer choose = 0;
		
		do {
			Integer index = 1;
			for (Hero h : heroList) {
				System.out.print(index + " " + h.getName() + " " + h.hp + " " + h.attack + " " + h.energy + " " );
				if(h.getClass().equals(Range.class)) {
					
					System.out.print(((Range)h).getAgility());
				}else {
					System.out.print(((Wizard)h).getMagic());
				}
				System.out.println(" ");
				index++;
			}
		}
			System.out.println("Title");
			System.out.println("1. Add data");
			System.out.println("2. Update Data");
			System.out.println("3. Delete data");
			System.out.println("4. exit");
			do {
				System.out.println("Choose >>");
				choose = sc.nextInt();sc.nextLine();
				}while (choose <1 || choose >4);
			switch (choose) {
			case 1:
				break;
			case 2:
				break;
			case 3: deleteHero();
				break;
			default:
				break;
			}
	}
	private void updateHero() {
		System.out.print("input hero number to update: ");
		Integer index = sc.nextInt();sc.nextLine();
		
		System.out.println("input new name: ");
		String name = sc.nextLine();
		
		if(heroList.get(index -1) instanceof Range) {
			System.out.println("input new agility");
			Integer agility = sc.nextInt();sc.nextLine();
			
			Range r = (Range) heroList.get(index - 1);
			r.name = name;
			r.setAgility(agility);
		}else {
			System.out.println("input new magic");
			Integer agility = sc.nextInt();sc.nextLine();
			
			Range w = (Range) heroList.get(index - 1);
			w.name = name;
			w.setAgility(agility);
		}
	}
	private void deleteHero() {
		System.out.println("Input hero number to delete: ");
		Integer index = sc.nextInt();sc.nextLine();
		heroList.remove(index - 1);
	}
	public static void main(String[]args) {
		new Main();
	}
}
