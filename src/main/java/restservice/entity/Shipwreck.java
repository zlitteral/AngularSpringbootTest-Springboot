package restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shipwreck {
    @Id
    private Integer id  ;
    private String name;
    private String description;
    private String condition;
    private Integer depth;
    private Integer yearDiscovered;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Integer getYearDiscovered() {
        return yearDiscovered;
    }

    public void setYearDiscovered(Integer yearDiscovered) {
        this.yearDiscovered = yearDiscovered;
    }


    @Override
    public String toString() {
        return "Shipwreck{" + "name='" + name + '\'' + ", description='" + description + '\'' + ", condition='" + condition + '\''
                + ", depth='" + depth + '\'' + ", yearDiscovered='" + yearDiscovered + '\'' + '}';
    }
}
