package com.ledlampapi.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "user", schema = "ledlampapi", catalog = "")
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Basic
    @Column(name = "red", nullable = false, length = 200)
    private int red;

    @Basic
    @Column(name = "green", nullable = false, length = 200)
    private int green;

    @Basic
    @Column(name = "blue", nullable = false, length = 200)
    private int blue;
}
