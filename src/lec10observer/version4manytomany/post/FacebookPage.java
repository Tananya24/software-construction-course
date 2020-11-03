package lec10observer.version4manytomany.post;

import lec10observer.version4manytomany.util.Subject;

import java.util.ArrayList;
import java.util.List;

public class FacebookPage extends Subject {
    private String name;
    private List<String> posts;

    public FacebookPage(String name) {
        this.name = name;
        this.posts = new ArrayList<>();
    }

    public void post(String message) {
        posts.add(message);
        notifyObservers(message);
    }
}
