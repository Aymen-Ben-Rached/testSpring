package com.example.test.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

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
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;
    String libelleMenu;
    TypeMenu typeMenu;
    Float prixTotal;
    @ManyToMany
    List<Client> clients = new ArrayList<>();
    @OneToMany
    List<Composant> composants = new ArrayList<>();
}
