package com.cafe.waterdeer.cafe;

import com.cafe.waterdeer.cafe.Cafe;
import jakarta.persistence.*;

@Entity
@Table(name = "categorie")
public class Categorie {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "authority", nullable = false)
    private Integer authority;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cafes_id", nullable = false)
    private Cafe cafes;

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

    public Integer getAuthority() {
        return authority;
    }

    public void setAuthority(Integer authority) {
        this.authority = authority;
    }

    public Cafe getCafes() {
        return cafes;
    }

    public void setCafes(Cafe cafes) {
        this.cafes = cafes;
    }

}