package com.egs.boot.dto;

import javax.persistence.*;

/**
 * Created by zorikz on 03/30/2016.
 */

@Entity
@Table(name = "category")
public class CategoryDto {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    String name;

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

}
