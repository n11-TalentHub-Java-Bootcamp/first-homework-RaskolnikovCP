package Entity;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORY")
public class Category {

    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false, length = 50)
    private String name;

    @Column(name = "REFRACTRION")
    private Long refraction;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TOP_CATEGORY")
    private Category topCategory;

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

    public Long getRefraction() {
        return refraction;
    }

    public void setRefraction(Long refraction) {
        this.refraction = refraction;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", refraction=" + refraction +
                ", topCategory=" + topCategory +
                '}';
    }

}
