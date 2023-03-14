package org.hibernate.bugs;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "bar")
public class Bar {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @ManyToMany
    @JoinTable(name = "foo_bar",
            joinColumns = @JoinColumn(name = "bar_id"),
            inverseJoinColumns = @JoinColumn(name = "foo_id"))
    private List<FooBar> fooBars;
}
