package soap;

import java.util.List;

public class CheckoutSchema {
    private List<CharacteristicSchema> characteristicSchemas;
    private List<Reference> references;

    public List<CharacteristicSchema> getCharacteristicSchemas() {
        return characteristicSchemas;
    }

    public void setCharacteristicSchemas(List<CharacteristicSchema> characteristicSchemas) {
        this.characteristicSchemas = characteristicSchemas;
    }

    public List<Reference> getReferences() {
        return references;
    }

    public void setReferences(List<Reference> references) {
        this.references = references;
    }
}
