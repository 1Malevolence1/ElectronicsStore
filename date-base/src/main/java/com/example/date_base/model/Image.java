package com.example.date_base.model;

import jakarta.persistence.*;
import lombok.*;


@Entity()
@Table(name = "image", schema = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private Long id;

    @Column(name = "image_name")
    private String name;

    @Column(name = "original_file_name")
    private String originalFileName;

    @Column(name = "preview")
    private Boolean previewFileImage;


    private Integer size;

    @Column(name = "content_type")
    private String contentType;

    private byte[] bytes;
}
