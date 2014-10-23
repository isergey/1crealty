package soap;

import java.util.List;

public class CheckoutObject {
    private String id;
    private String objectId;
    private List<CharacteristicValues> characteristics;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public List<CharacteristicValues> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<CharacteristicValues> characteristics) {
        this.characteristics = characteristics;
    }
}
