package portfolio.vaadintutorial.data;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;

import javax.annotation.Nullable;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Company extends AbstractEntity {

    @NotBlank
    private String name;

    @OneToMany(mappedBy="company")
    @Nullable
    private List<Contact> employees = new LinkedList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Contact> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Contact> employees) {
        this.employees = employees;
    }
}
