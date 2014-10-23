package soap;

import java.util.Currency;
import java.util.List;

public class Schema {
    private List<CharacteristicSchema> characteristicSchemas;
    private List<Reference> references;
    private List<Currency> currencies;
    private List<Unit> units;

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

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }
}
