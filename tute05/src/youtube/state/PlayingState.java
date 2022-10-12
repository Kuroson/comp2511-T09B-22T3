package youtube.state;

import youtube.Viewing;

public class PlayingState extends ViewingState {
    public PlayingState(Viewing viewing) {
        super(viewing);
    }

    @Override
    public String onLock() {
        this.getViewing().changeState(new LockedState(getViewing()));
        return "Stop playing";
    }

    @Override
    public String onPlay() {
        this.getViewing().changeState(new ReadyState(getViewing()));
        return "Paused.";
    }

    @Override
    public String onNext() {
        return this.getViewing().getNextVideo();
    }
}