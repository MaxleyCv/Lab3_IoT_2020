package ua.lviv.iot.weapons.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "\"lager\"")
public class Lager {
    private String location;

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int lagerId;

    @OneToMany (mappedBy = "lager", fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JsonIgnoreProperties("lager")
    private Set<Arm> arms;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getLagerId() {
        return lagerId;
    }

    public void setLagerId(int lagerId) {
        this.lagerId = lagerId;
    }

    public Set<Arm> getArms() {
        return arms;
    }

    public void setArms(Set<Arm> arms) {
        this.arms = arms;
    }
}