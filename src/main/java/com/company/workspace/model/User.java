package com.company.workspace.model;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length=30, unique = true)
    private String username;

    @Column(nullable = false, length=100)
    private String password;

    @Column(nullable = false, length=50)
    private String email;

    //@ColumnDefault("user")
    @Enumerated(EnumType.STRING)
    private RoleType role;

    @Column(updatable = false)
    @CreationTimestamp
    private Timestamp createDate;

    @UpdateTimestamp
    private Timestamp updateDate;

}
