package com.egs.boot.dto;

import javax.persistence.*;

/**
 * Created by zorikz on 03/30/2016.
 */

@Entity
@Table(name = "user")
public class UserDto {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    String name;

    @Column(name = "surname")
    String surname;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
