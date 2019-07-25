package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String mnemonic;

    @Column(length = 100)
    private String description;

    @UpdateTimestamp
    @Column(nullable = false)
    private Timestamp lastUpdate;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private Timestamp created;
}
