package com.varren.model;

import javax.persistence.*;


@Entity
@Table(name = "placement")
public class Placement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    private String name;

    @ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.REMOVE)
    private PlacementType type;

    @ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.REMOVE)
    private PlacementType theme;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlacementType getType() {
        return type;
    }

    public void setType(PlacementType type) {
        this.type = type;
    }

    public PlacementType getTheme() {
        return theme;
    }

    public void setTheme(PlacementType theme) {
        this.theme = theme;
    }
}
