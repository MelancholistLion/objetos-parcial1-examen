import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Culture {
    private String name;
    private String description;
    private LinkedList<String> countries = new LinkedList<>();
    private LinkedList<Deity> deities = new LinkedList<>();

    public Culture(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCountries(LinkedList<String> countries) {
        this.countries = countries;
    }
    public void addRelatedCountry(String country) {
        countries.add(country);
    }
    public void setDeities(LinkedList<Deity> deities) {
        this.deities = deities;
    }
    public void addDeity(Deity deity) {
        deities.add(deity);
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public LinkedList<String> getRelatedCountries() {
        return countries;
    }
    public LinkedList<Deity> getDeities() {
        return deities;
    }
}
