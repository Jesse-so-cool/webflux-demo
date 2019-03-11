package com.jesse.reactiveWebDemo.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "man")
public class Man {
    @Id
    private ObjectId _id;


    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    private String hobbit;


    public String getHobbit() {
        return hobbit;
    }

    public void setHobbit(String hobbit) {
        this.hobbit = hobbit;
    }

    public Man(ObjectId _id, String hobbit) {
        this._id = _id;
        this.hobbit = hobbit;
    }

    public Man() {

    }
}
