package com.example.date_base.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "description_brief_product", schema = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DescriptionBriefProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;


    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "brief_text")
    private String briefText;
}