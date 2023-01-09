package com.cafe.waterdeer.auth;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.cafe.waterdeer.auth.User} entity
 */
@Data
public class UserDto implements Serializable {
    private final Integer id;
    private final String userId;
    private final String userPw;
    private final String email;
}