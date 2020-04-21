package ua.lviv.iot.weapons.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "\"division\"")
public class Division {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer divisionId;

    private String name;

    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable (name = "Division_Weapons", joinColumns = {
            @JoinColumn (name = "division_id", nullable = false)
    }, inverseJoinColumns = {
            @JoinColumn (name = "weapon_id", nullable = false)
    })
    @JsonIgnoreProperties("divisions")
    private Set<AbstractArm> usedArms;

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<AbstractArm> getUsedArms() {
        return usedArms;
    }

    public void setUsedArms(Set<AbstractArm> usedArms) {
        this.usedArms = usedArms;
    }
}
