package youtube.state;

import youtube.Viewing;

public class LockedState extends ViewingState {
    public LockedState(Viewing viewing) {
        super(viewing);
        viewing.setPlaying(false);
    }

    @Override
    public String onLock() {
        if (this.getViewing().isPlaying()) {
            this.getViewing().changeState(new ReadyState(getViewing()));
            return "Stop playing";
        } else {
            return "Locked.";
        }
    }

    @Override
    public String onPlay() {
        this.getViewing().changeState(new ReadyState(getViewing()));
        return "Ready...";
    }

    @Override
    public String onNext() {
        return "Error: Locked";
    }
}