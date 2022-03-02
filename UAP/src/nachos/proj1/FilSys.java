package nachos.proj1;

import java.util.ArrayList;

import nachos.machine.FileSystem;
import nachos.machine.Machine;
import nachos.machine.OpenFile;

public class FilSys {

	private FileSystem fs = Machine.stubFileSystem();
	public FilSys() {
		// TODO Auto-generated constructor stub
		
	}
	
	public void writeFile(String filename, ArrayList<String> music) {
		OpenFile out =  fs.open(filename, true);
		for (String s : music) {
			s += "\n";
			byte[] temp = s.getBytes();
			out.write(temp, 0, temp.length);
		}
		out.close();
	}
	
	public ArrayList<String> readFile(String filename) {
		OpenFile in = fs.open(filename, false);
		
		if (in == null) return null;
	
		byte[] buf = new byte[1000];
		
		in.read(buf, 0, buf.length);
		
		String temp = new String(buf);

		String[] result =  temp.trim().split("\n");
		
		ArrayList<String> data = new ArrayList<>();
		for (String s : result) {
			String [] temps = s.split("#");
			s.add(s);
		}
		

		in.close();
		return data;
	}
	

	public Boolean deleteFile(String filename) {
		return fs.remove(filename);
	}


}
