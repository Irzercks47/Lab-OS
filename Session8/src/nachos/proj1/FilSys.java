package nachos.proj1;

import java.util.ArrayList;

import nachos.machine.FileSystem;
import nachos.machine.Machine;
import nachos.machine.OpenFile;

public class FilSys {
	//pastikan dari machine
	private FileSystem fs = Machine.stubFileSystem();
	
	public FilSys() {
		// TODO Auto-generated constructor stub
	}
	
	public void writeFile(String filename, ArrayList<String> data) {
		//1. open file
		//kalo true bila file tidak ada maka akan create file
		//open file juga dari machine
		OpenFile out =  fs.open(filename, true);
		//alberic\n -> String -> bytes
		//Leo\n
		//Richard\n
		
		//2.write file
		//data masih dalam bentuk string sebelum ditulis data harus di convert ke byte
		for (String s : data) {
			//akan menambahakan enter pada txt nya
			s += "\n";
			//convert data ke bytes
			//karena byte banyak sehingga menggunakan array
			byte[] temp = s.getBytes();
			
			//3.write data
			//kita akan write apa kita akan write temp mulai dari nol sampai byte nya habis
			out.write(temp, 0, temp.length);
		}
		//4.close file
		//bila fungsi lain tidak jalan cek apa file sudah di close
		out.close();
		//kalau ada yang harus di return maka gunakan ini
//		return true;
	}
	
	//dia akan readfile jadi sehingga tidak usah bingung membuat read buat string atau tipe data lain
	public ArrayList<String> readFile(String filename) {
		//1. open file
		//data.txt
		OpenFile in = fs.open(filename, false);
		
		//bila file tidak ada
		if (in == null) return null;
		
		//2. read file
		//define buf karena kita tidak tahu berapa maka di set demikian
		byte[] buf = new byte[1000];
		
		in.read(buf, 0, buf.length);
		
		//menunjukkan byte
//		for (byte b : buf) {
//			System.out.println(b);
//		}
		//3. convert data to string
		String temp = new String(buf);
		
		
//		System.out.println(temp);
		
		//4. remove whitespace
		//Alberik\n
		//Leo\n dll
		//namun dibawahnya akan terdapat tempat kosong maka harus di remove
		//dan data masih satu array maka harus di split dan dia juga lebih dari satu data maka pakai array
		String[] result =  temp.trim().split("\n");
		
		//5. convert string array to list
		ArrayList<String> data = new ArrayList<>();
		for (String s : result) {
			String [] temps = s.split("#");
			System.out.println(temps[0]);
			System.out.println(temps[1]);
			System.out.println(temps[2]);
			
			//bisa menggunakan ini
//			new People(temps[0], temps[1], temps[2]);
			System.out.println("");
			data.add(s);
		}
		
		//6. close file
		in.close();
		return data;
	}
	
	//delete file
	public Boolean deleteFile(String filename) {
		return fs.remove(filename);
	}

}
