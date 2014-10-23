package soap;

import java.util.List;

public class SearchCriteria {
    private String operator;
    private List<SearchAttribute> attrs;
    private List<SearchCriteria> criterias;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public List<SearchAttribute> getAttrs() {
        return attrs;
    }

    public void setAttrs(List<SearchAttribute> attrs) {
        this.attrs = attrs;
    }

    public List<SearchCriteria> getCriterias() {
        return criterias;
    }

    public void setCriterias(List<SearchCriteria> criterias) {
        this.criterias = criterias;
    }
}
