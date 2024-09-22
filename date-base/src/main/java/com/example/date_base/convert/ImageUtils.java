package com.example.date_base.convert;


import com.example.date_base.model.Image;

public final class ImageUtils {

    public static String getImageDataInBase64(Image model) {
        // Логирование объекта изображения

        return "data:" + model.getContentType() + ";base64," + java.util.Base64.getEncoder().encodeToString(model.getBytes());
    }

}
