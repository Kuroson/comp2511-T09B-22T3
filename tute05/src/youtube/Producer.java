package youtube;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject
 */
public class Producer {
    private String name;
    private List<User> subscribers = new ArrayList<User>();
    private List<Video> videos = new ArrayList<Video>();

    public Producer(String name) {
        this.name = name;
    }

    /**
     * Adding an subscriber (observer)
     * @param user
     */
    public void addSubscriber(User user) {
        // TODO
    }

    /**
     * Posting a new video (notifying all observers)
     * @param name
     * @param length
     */
    public void postVideo(String name, int length) {
        // TODO
    }

    @Override
    public String toString() {
        return name;
    }
}