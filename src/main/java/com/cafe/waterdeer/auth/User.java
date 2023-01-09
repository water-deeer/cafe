package com.cafe.waterdeer.auth;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "user_id", nullable = false, length = 45)
    private String userId;

    @Column(name = "user_pw", nullable = false, length = 45)
    private String userPw;

    @Column(name = "email", length = 45)
    private String email;

    @Builder
    public User(){}
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}