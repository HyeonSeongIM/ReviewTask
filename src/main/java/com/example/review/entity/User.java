package com.example.review.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    /** 사용자 등록 */
    @Id
    private Integer id;

    private String username;

    private String password;
}
