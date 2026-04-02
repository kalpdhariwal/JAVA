interface Playable {
    void play();
    void pause();
    void stop();
}
class MusicPlayer implements Playable {
    boolean isPlaying = false;
    public void play() {
        if (!isPlaying) {
            isPlaying = true;
            System.out.println("Music is playing");
        } else {
            System.out.println("Music is already playing");
        }
    }
    public void pause() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Music is paused");
        } else {
            System.out.println("Cannot pause, music is not playing");
        }
    }
    public void stop() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Music is stopped");
        } else {
            System.out.println("Cannot stop, music is not playing");
        }
    }
}
public class Q4 {
    public static void main(String[] args) {
        System.out.println("24BIT106 Kalp N Dhariwal");
        MusicPlayer player = new MusicPlayer();
        player.play();
        player.pause();
        player.stop();
    }
}