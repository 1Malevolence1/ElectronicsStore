package com.example.date_base.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "big_description", schema = "product")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DescriptionFullProduct{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "big_description_id")
    private Long id;

    @Column(name = "big_description_text")
    private String text;

}
