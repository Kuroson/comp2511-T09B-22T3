package youtube;

import youtube.state.ViewingState;

public class Viewing {
    private Video video;
    private Video nextVideo;
    private Producer user;
    private boolean playing = false; // Is the video playing

    public Viewing(Video video, Video nextVideo, Producer user) {
        this.video = video;
        this.nextVideo = nextVideo;
        this.user = user;
    }

    public void setPlaying(boolean play) {
        this.playing = play;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void changeState(ViewingState newState) {
        // TODO
    }

    public String startPlayback() {
        return "Playing video " + video.getName() + "!!!";
    }

    public String getNextVideo() {
        return nextVideo.getName();
    }

    public String lock() {
        // TODO
        return null;
    }

    public String play() {
        // TODO
        return null;
    }

    public String next() {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        // Producer producer = new Producer("Ashesh");
        // Viewing view = new Viewing(new Video("Video 1", 10, producer), new Video("Video 2", 14, producer), producer);
        // view.setPlaying(true);

        // System.out.println(view.play());
        // System.out.println(view.play());
        // System.out.println(view.next());
        // System.out.println(view.lock());
        // System.out.println(view.play());
        // System.out.println(view.next());
        // System.out.println(view.play());
    }

}