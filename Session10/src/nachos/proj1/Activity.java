package nachos.proj1;

public class Activity implements Runnable{
	private String name;
	private Integer time;
	
	//alt + shift + s
	public Activity(String name, Integer time) {
		super();
		this.name = name;
		this.time = time;
	}
	
	// setter getter alt + shift + s + r
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//makan - 5
		//makan - 4
		//makan - 0
		//selesai makan
		//aktivitas selanjutnya
		
		while(time > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(" Doing " + name + " for " + time + "seconds");
			time--;
		}
		
		System.out.println(name + " Done ");
	}

	

}
