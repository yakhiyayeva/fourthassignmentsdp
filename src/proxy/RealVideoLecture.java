package proxy;

// Real Subject: RealVideoLecture
public class RealVideoLecture implements VideoLecture {
    private String title;
    private String content;

    public RealVideoLecture(String title) {
        this.title = title;
        loadVideoFromServer();
    }

    // Simulate loading the video
    private void loadVideoFromServer() {
        System.out.println("Loading video: " + title + " from server...");
        try {
            Thread.sleep(2000); // Simulate loading delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        content = "Video content for " + title;
    }

    @Override
    public void getInfo() {
        System.out.println("Video Title: " + title);
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + title);
        System.out.println(content);
    }
}

