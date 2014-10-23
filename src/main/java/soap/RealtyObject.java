package soap;

import java.util.List;

public class RealtyObject {
    private String id;
    private List<ObjectCharacteristic> characteristics;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ObjectCharacteristic> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<ObjectCharacteristic> characteristics) {
        this.characteristics = characteristics;
    }
}
