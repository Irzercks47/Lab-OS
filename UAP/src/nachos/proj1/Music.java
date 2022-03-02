package nachos.proj1;

public class Music implements Runnable{
	private MyConsole con = new MyConsole();
	private String songName;
	private int songDur;
	private String songLyric;
	private int songTime;
	public Music(String songName, int songDur, String songLyric, int songTime) {
		super();
		this.songName = songName;
		this.songDur = songDur;
		this.songLyric = songLyric;
		this.songTime = songTime;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public int getSongDur() {
		return songDur;
	}
	public void setSongDur(int songDur) {
		this.songDur = songDur;
	}
	public String getSongLyric() {
		return songLyric;
	}
	public void setSongLyric(String songLyric) {
		this.songLyric = songLyric;
	}
	public int getSongTime() {
		return songTime;
	}
	public void setSongTime(int songTime) {
		this.songTime = songTime;
	}
	public void run() {
		songTime = Math.round(songDur/60);
		while(songTime > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			con.println("Now Playing..." + songName);
			con.println("Time elapsed: " + songTime + "minute(s)");
			con.println("===============================================");
			con.println("");
			con.println("Song lyrics: ");
			con.println(songLyric);
			songTime--;
		}
	}

}
