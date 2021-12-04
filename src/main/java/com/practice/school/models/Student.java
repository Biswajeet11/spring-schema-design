package com.practice.school.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Getter
@Setter
@Entity
public class Student extends BaseModel{
    @OneToOne
    private User user;

    @ManyToMany(mappedBy = "students")
    List<Batch> batches;
}
