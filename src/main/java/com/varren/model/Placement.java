package com.varren.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import java.util.Set;


@Data
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



}
