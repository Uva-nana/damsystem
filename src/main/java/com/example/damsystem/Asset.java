package com.example.damsystem;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity   // this class is now a DATABASE TABLE
public class Asset {

    @Id   // primary key (unique id for each row)
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // database auto-generates it
    private int id;

    private String name;
    private String type;        // image / video
    private String url;         // where the file is stored
    private String uploadedAt;  // date & time

    // JPA needs an empty constructor to build objects from the database
    public Asset() {
    }

    public Asset(String name, String type, String url, String uploadedAt) {
        this.name = name;
        this.type = type;
        this.url = url;
        this.uploadedAt = uploadedAt;
    }

    // getters — read values (also used for JSON)
    public int getId()            { return id; }
    public String getName()       { return name; }
    public String getType()       { return type; }
    public String getUrl()        { return url; }
    public String getUploadedAt() { return uploadedAt; }

    // setters — JPA/Jackson use these to fill the object
    public void setId(int id)                     { this.id = id; }
    public void setName(String name)              { this.name = name; }
    public void setType(String type)              { this.type = type; }
    public void setUrl(String url)                { this.url = url; }
    public void setUploadedAt(String uploadedAt)  { this.uploadedAt = uploadedAt; }
}
