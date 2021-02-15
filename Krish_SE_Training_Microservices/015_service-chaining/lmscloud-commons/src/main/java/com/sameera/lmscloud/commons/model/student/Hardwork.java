package com.sameera.lmscloud.commons.model.student;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "starPoint")
public class Hardwork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int roleId;
    @ManyToOne
    @JoinColumn
    Student student;
    int point;
    LocalDateTime expireDate;

}
