import java.util.ArrayList;

public class Main {
	ArrayList<Item> itemList = new ArrayList<>();
	ArrayList<Upgradable> upgradableList = new ArrayList<>();
	public Main() {
		Coffee coffe = new Coffee("Cold brew", 1, 4, "FLORES bean", 0);
		Membership member = new Membership("Bambang");
		upgradableList.add(coffe);
		upgradableList.add(member);
		for (Upgradable u : upgradableList) {
			u.changeSize();
			if (u instanceof Coffee) {
				System.out.println(((Coffee)u).getPrice());	
		}else if (u instanceof Membership) {
			((Membership)u).printNama();
			}
		}
//		itemList.add(coffe);
//		itemList.add(new CheeseCake("Lovely cheese cake", 1, 5, "parmesan", 2.8, false));
//		itemList.add(new Frappucino("Javachino", 12, 2, "Papua bean", 1));
		
//		for (Item item : itemList) {
//				item.printData();
//				System.out.println(item.getPrice());
//		}
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
