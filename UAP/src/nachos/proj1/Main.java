package nachos.proj1;

import java.util.ArrayList;
import java.util.Vector;

import nachos.threads.KThread;

public class Main {
	private MyConsole con = new MyConsole();
	private Vector<Music> musicVector = new Vector<>();
	ArrayList<Music> musicList = new ArrayList<>();
	String filename = "songList.txt";
	private FilSys fs = new FilSys();
	public Main() {
		Integer menu= 0;
		while (true) {			
			do {
				con.println("SPOOJIFY");
				con.println("==========");
				con.println(" 1. Write Song ");
				con.println(" 2. Listen All Songs");
				con.println(" 3. Delete Songs");
				con.print(" >> ");
				menu = con.nextInt();
			} while (menu < 1 || menu > 3);
			switch (menu) {
			case 1:
				writeSong();
				break;
			case 2:
				listenSong();
				break;
			case 3:
				deleteFile();
			}
		}
		
	}
	
	private void writeSong() {
		String songName;
		String songLyric;
		String songDur;
		con.println("Insert song name: ");
		songName =  con.nextLine();
		con.println("Insert song duration: ");
		songDur = con.nextLine();
		con.println("Insert song lyric: ");
		songLyric = con.nextLine();
		musicList.add(new Music(songName,songDur,songLyric));
	}
	
	private void listenSong() {
		while(!musicVector.isEmpty()) {
			new KThread(musicVector.remove(0)).fork();
		}
	}
	
	private void deleteFile() {
		fs.deleteFile(filename);
	}

}
