package com.example.date_base.dto.image;

public record RequestImageDto(
         String name,
         String originalFileName,
         Long size,
         String contentType,
         Boolean previewFileImage,
         byte[] bytes) {

 }