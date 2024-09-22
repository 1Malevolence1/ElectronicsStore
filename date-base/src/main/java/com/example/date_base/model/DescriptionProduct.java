package com.example.date_base.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "description", schema = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DescriptionProduct
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "description_id")
    private Long id;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "description_id")
    private DescriptionFullProduct fullDescriptionProduct;


    //TODO проконтроливать как будут удляться маленькие описание cascade ALL

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "description_id")
    private List<DescriptionBriefProduct> briefDescriptionProduct = new ArrayList<>();


}
