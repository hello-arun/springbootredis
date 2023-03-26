package com.springbootredis.demo.models;

import java.io.Serializable;

public class MyRedisEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String name;
    private String email;

//    public MyRedisEntity() {
//    }

    public MyRedisEntity(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // getters and setters omitted for brevity

    @Override
    public String toString() {
        return "MyRedisEntity [id=" + id + ", name=" + name + ", email=" + email + "]";
    }

	public String getValue() {
		return "My Redis Entity";
		// TODO Auto-generated method stub
	}
	public String getId() {
		return id;
	}
}
