package youtube.state;

import youtube.Viewing;

public abstract class ViewingState {
    private Viewing viewing;

    public ViewingState(Viewing viewing) {
        this.viewing = viewing;
    }

    public abstract String onLock();

    public abstract String onPlay();

    public abstract String onNext();

    public Viewing getViewing() {
        return this.viewing;
    }
}