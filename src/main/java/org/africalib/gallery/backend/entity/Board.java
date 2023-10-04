package org.africalib.gallery.backend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "boards")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //long->int

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String good;

}
