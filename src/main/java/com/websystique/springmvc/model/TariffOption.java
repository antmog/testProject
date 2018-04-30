package com.websystique.springmvc.model;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@lombok.Getter
@lombok.Setter
@Entity
@Table(name = "TARIFF_OPTIONS")
public class TariffOption implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OPTION_ID")
    private Integer id;

    @NotEmpty
    @Column(name = "NAME", unique = true, nullable = false)
    private String name;

    @NotEmpty
    @Column(name = "PRICE", nullable = false)
    private Double price;

    @NotEmpty
    @Column(name = "COSTOFADD", nullable = false)
    private Double costOfAdd;


    @NotEmpty
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "RELATED_OPTIONS",
            joinColumns = {@JoinColumn(name = "OPTION_ID", nullable = false, referencedColumnName = "OPTION_ID")},
            inverseJoinColumns = {@JoinColumn(name = "RELATED_OPTION_ID", nullable = false, referencedColumnName = "OPTION_ID")})
    private Set<TariffOption> relatedTariffOptions = new HashSet<TariffOption>();


    @NotEmpty
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "EXCLUDING_OPTIONS",
            joinColumns = {@JoinColumn(name = "OPTION_ID", nullable = false, referencedColumnName = "OPTION_ID")},
            inverseJoinColumns = {@JoinColumn(name = "EXCLUDING_OPTION_ID", nullable = false, referencedColumnName = "OPTION_ID")})
    private Set<TariffOption> excludingTariffOptions = new HashSet<TariffOption>();


    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", price=" + price
                + ", costOfAdd=" + costOfAdd + "]";

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof TariffOption))
            return false;
        TariffOption other = (TariffOption) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
