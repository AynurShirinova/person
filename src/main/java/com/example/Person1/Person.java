package com.example.Person1;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Setter
@Getter
@Entity
@Table
 public class Person {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int Id;
@Column
 private String name;
@Column
 private String surname;
@Column
 private String patron;
@Column
 private String sex;
 @ManyToOne
 @JoinColumn(name = "nationality_id")
 private Nationality nationality;
 @ManyToOne
 @JoinColumn(name = "place_of_birth_id")
 private PlaceOfBirth placeOfBirth;
 @Column(name = "card_no")
 private String cardNo;
 @Column(name = "personal_no")
 private String personalNo;
 @ManyToOne
 @JoinColumn(name = "blood_group_id")
 private BloodGroup bloodGroup;

}
