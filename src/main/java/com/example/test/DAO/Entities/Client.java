package com.example.test.DAO.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    String identifiant;
    LocalDate datePremiereVisite;
    @ManyToMany(mappedBy = "clients",cascade = CascadeType.ALL)
    List<Menu> menus = new ArrayList<>();


}
