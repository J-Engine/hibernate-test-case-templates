package org.hibernate.bugs;

import jakarta.persistence.*;

@Entity
@Table(name = "foo_bar")
public class FooBar {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String note;

    @PrePersist
    void prePersist(){
        setNote("XXXXX");
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
