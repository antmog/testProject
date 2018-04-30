package com.websystique.springmvc.model;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "TARIFF")
public class Tariff implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TARIFF_ID")
    private Integer id;

    @NotEmpty
    @Column(name="NAME", unique=true, nullable=false)
    private String name;

    @NotEmpty
    @Column(name="PRICE", nullable=false)
    private Double price;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "AVAILABLE_OPTIONS",
            joinColumns = {@JoinColumn(name = "TARIFF_ID", nullable = false, referencedColumnName = "TARIFF_ID")},
            inverseJoinColumns = {@JoinColumn(name = "OPTION_ID", nullable = false, referencedColumnName = "OPTION_ID")})
    private Set<TariffOption> excludingTariffOptions = new HashSet<TariffOption>();

}
