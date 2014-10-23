package soap;

public class Video {
    private String id;
    private int order;
    private String group;
    private String videoPath;
    private String thumbnailPath;
    private String htmlPlayerCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    public String getThumbnailPath() {
        return thumbnailPath;
    }

    public void setThumbnailPath(String thumbnailPath) {
        this.thumbnailPath = thumbnailPath;
    }

    public String getHtmlPlayerCode() {
        return htmlPlayerCode;
    }

    public void setHtmlPlayerCode(String htmlPlayerCode) {
        this.htmlPlayerCode = htmlPlayerCode;
    }
}
