package practice_programs_java.bin;

public class InterfaceExample2 {
	public static void main(String[] args) {
		MusicPlayer spotify = new SpotifyPlayer();
		MusicPlayer youtube = new YouTubePlayer();
		
		new InterfaceExample2().songs(spotify);
		new InterfaceExample2().songs(youtube);
		
	}
	
	public void songs(MusicPlayer mp) {
		mp.play();
		mp.pause();
		mp.next();
		mp.previous();
	}

}

interface MusicPlayer{
	void play();
	void pause();
	void next();
	void previous();
	}

class SpotifyPlayer implements MusicPlayer{
	public void play() {
		System.out.println("Spotify is playing music...");
	}
	public void pause() {
		System.out.println("Spotify paused the music...");
	}
	public void next() {
		System.out.println("Spotify skipped to the next song...");
	}
	public void previous() {
		System.out.println("Spotify went back to the previous track..");
	}
}

class YouTubePlayer implements MusicPlayer{
	public void play() {
		System.out.println("YouTube is playing music...");
	}
	public void pause() {
		System.out.println("YouTube paused the music...");
	}
	public void next() {
		System.out.println("YouTube skipped to the next song...");
	}
	public void previous() {
		System.out.println("YouTube went back to the previous track..");
	}
}

