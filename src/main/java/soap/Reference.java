package soap;

import java.util.List;

public class Reference {
    private String id;
    private List<ReferenceItem> items;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ReferenceItem> getItems() {
        return items;
    }

    public void setItems(List<ReferenceItem> items) {
        this.items = items;
    }
}
