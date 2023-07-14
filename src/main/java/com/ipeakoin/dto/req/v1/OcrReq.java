package com.ipeakoin.dto.req.v1;

import com.ipeakoin.dto.req.DefaultReq;

/**
 * @author klover
 * description OcrIdCardFaceReq
 * date 2023/6/30 17:48
 */
public class OcrReq extends DefaultReq {
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "OcrIdCardFaceReq{" +
                "image='" + image + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}