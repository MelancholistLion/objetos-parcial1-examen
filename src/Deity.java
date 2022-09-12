import java.util.LinkedList;

public class Deity {
    private String name;
    private String description;
    private LinkedList<Deity> parents = new LinkedList<>();

    public Deity(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setParents(LinkedList<Deity> parents) {
        this.parents = parents;
    }
    public void addParent(Deity parent) {
        parents.add(parent);
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public LinkedList<Deity> getParents() {
        return parents;
    }
}
