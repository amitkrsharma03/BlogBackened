package com.blogsbackend.blogs.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class UserDto {
    private int id;
    private String username;
    private String email;
    private String password;
    private String about;
}
