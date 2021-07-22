package fr.myproject.joinmyboard.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "street")
    private String street;

    @Column(name = "complement_street")
    private String complementStreet;

    @Column(name = "zip_code")
    private int zipCode;

    @Column(name = "city")
    private String city;


}
