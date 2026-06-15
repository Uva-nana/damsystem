package com.example.damsystem;

public class Asset {
    private int id;
    private String name;
    private String type;        // image / video
    private String url;         // where the file is stored
    private String uploadedAt;  // date & time

    public Asset(int id, String name, String type, String url, String uploadedAt) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.url = url;
        this.uploadedAt = uploadedAt;
    }

    public int getId()            { return id; }
    public String getName()       { return name; }
    public String getType()       { return type; }
    public String getUrl()        { return url; }
    public String getUploadedAt() { return uploadedAt; }
}
