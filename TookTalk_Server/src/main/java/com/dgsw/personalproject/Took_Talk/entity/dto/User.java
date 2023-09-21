package com.dgsw.personalproject.Took_Talk.entity.dto;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String identity;

    @Column
    private String password;

    @Column
    private String nickname;

    @Column
    private Long age;

}
