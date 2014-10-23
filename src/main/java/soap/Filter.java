package soap;

import java.util.List;

public class Filter {
    private String group;
    private int order;
    private String initial;
    private String input;
    private String fromLabel;
    private String toLabel;
    private boolean multiple;
    private List<CharacteristicValues> showOn;
    private List<CharacteristicValues> hideOn;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getFromLabel() {
        return fromLabel;
    }

    public void setFromLabel(String fromLabel) {
        this.fromLabel = fromLabel;
    }

    public String getToLabel() {
        return toLabel;
    }

    public void setToLabel(String toLabel) {
        this.toLabel = toLabel;
    }

    public boolean isMultiple() {
        return multiple;
    }

    public void setMultiple(boolean multiple) {
        this.multiple = multiple;
    }

    public List<CharacteristicValues> getShowOn() {
        return showOn;
    }

    public void setShowOn(List<CharacteristicValues> showOn) {
        this.showOn = showOn;
    }

    public List<CharacteristicValues> getHideOn() {
        return hideOn;
    }

    public void setHideOn(List<CharacteristicValues> hideOn) {
        this.hideOn = hideOn;
    }
}
