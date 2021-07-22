package fr.myproject.joinmyboard.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "boardgame")
@NoArgsConstructor
@AllArgsConstructor
public class Boardgame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    @Column(name = "nb_players_min")
    private int nbPlayersMin;

    @Column(name = "nb_players_max")
    private int nbPlayersMax;

    @Column(name = "description")
    private String description;

    @Column(name = "playing_time")
    private int playingTime;
}
