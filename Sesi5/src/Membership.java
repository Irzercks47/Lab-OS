
public class Membership implements Upgradable {
	String nama;
	public Membership(String nama) {
		this.nama = nama;
	}
	
	public void printNama() {
		System.out.println(nama);
	}
	@Override
	public void changeSize() {
		// TODO Auto-generated method stub
		System.out.println("MEMBER" + nama + "UPGRADED HIS MEMBERSHIP STATUS");
		
	}
}
