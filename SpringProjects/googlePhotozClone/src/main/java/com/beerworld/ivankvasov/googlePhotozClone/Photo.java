package com.beerworld.ivankvasov.googlePhotozClone;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.NotEmpty;

public class Photo {
    private String id;

    @JsonIgnore
    private byte[] data;

    @NotEmpty
    private String fileName;

    public Photo() {
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }


    public Photo(String id, String fileName) {
        this.id = id;
        this.fileName = fileName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


}