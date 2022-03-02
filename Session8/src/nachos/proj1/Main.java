package nachos.proj1;

import java.util.ArrayList;

public class Main {

	//1. write file
	//2. read file
	//3. delete file
	String filename = "data.txt";
	//untuk masukin data
	ArrayList<String> data = new ArrayList<String>();
	ArrayList<String> readData = new ArrayList<String>();
	
	public Main() {
		FilSys fs = new FilSys();
		
		//untuk copy line of code menggunakan ctrl + alt + arrow down
		data.add("Alberik");
		data.add("Leo");
		data.add("Richard");
		data.add("Calvin");
		
//		fs.writeFile(filename, data);
		//file data.txt ada di nachos.test
		
		readData=  fs.readFile(filename);
		
		for (String s : readData) {
			System.out.println(s);
		}
		
//		fs.deleteFile(filename);
		
		readData = fs.readFile(filename);
		if(readData == null) System.out.println("No Data");
		else {
			for (String s : readData) {
				System.out.println(s);
			}
		}
	}

}
