package org.hibernate.bugs;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "foo")
public class Foo {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "foo_bar",
            joinColumns = @JoinColumn(name = "foo_id"),
            inverseJoinColumns = @JoinColumn(name = "bar_id"))
    private List<Bar> bars;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Bar> getBars() {
        return bars;
    }

    public void setBars(List<Bar> foo) {
        this.bars = foo;
    }
}
