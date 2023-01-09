package com.cafe.waterdeer.auth;

import com.cafe.waterdeer.cafe.Cafe;
import jakarta.persistence.*;

@Entity
@Table(name = "member")
public class Member {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "authority", nullable = false)
    private Integer authority;

    @Column(name = "nickname", nullable = false, length = 10)
    private String nickname;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cafe_id", nullable = false)
    private Cafe cafe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAuthority() {
        return authority;
    }

    public void setAuthority(Integer authority) {
        this.authority = authority;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Cafe getCafe() {
        return cafe;
    }

    public void setCafe(Cafe cafe) {
        this.cafe = cafe;
    }

}