package com.practice.school.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class BirthDate extends BaseModel {
    private String date;

    @OneToMany(mappedBy = "dob")
    List<User> userList;
}
