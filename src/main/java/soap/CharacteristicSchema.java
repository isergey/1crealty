package soap;

public class CharacteristicSchema{
    private String id;
    private String title;
    private String type;
    private String reference;
    private String unitId;
    private boolean showInFilter;
    private Filter filter;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unit) {
        this.unitId = unit;
    }

    public boolean isShowInFilter() {
        return showInFilter;
    }

    public void setShowInFilter(boolean showInFilter) {
        this.showInFilter = showInFilter;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }
}

