package com.ipeakoin.v1.core.dto.req;

/**
 * OcrReq
 *
 * @author klover
 * @date 2024/4/12 14:13
 */
public class OcrReq {
    private String image;

    @Override
    public String toString() {
        return "OcrReq{" +
                "image='" + image + '\'' +
                '}';
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
