import java.util.LinkedList;

public class Culture {
    private String name;
    private String description;
    private LinkedList<String> countries;
    private LinkedList<Deity> deities;

    public Culture(String name, String description) {
        this.name = name;
        this.description = description;
        countries = new LinkedList<>();
        deities = new LinkedList<>();
    }
    public void addRelatedCountry(String country) {
        countries.add(country);
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
