package soap;


import java.util.List;

public class SearchResult {
    private int total;
    private int offset;
    private int limit;
    private List<RealtyObject> objects;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public List<RealtyObject> getObjects() {
        return objects;
    }

    public void setObjects(List<RealtyObject> objects) {
        this.objects = objects;
    }
}
