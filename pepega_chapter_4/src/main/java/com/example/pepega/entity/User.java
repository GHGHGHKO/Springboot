package com.example.pepega.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {

    @Id //primaryKey 임을 알린다.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // primaryKey 생성 전략을 DB에 위임한다는 뜻.
    // primaryKey 필드를 auto_increment로 설정해 놓은 경우와 같다.
    private long msrl;

    @Column(nullable = false, unique = true, length = 30)
    // uid column을 명시한다. 필수 입력, 중복 안됨, 길이는 30제한
    private String uid;

    @Column(nullable = false, length = 100)
    // name column을 명시, 필수 입력, 길이 100 제한
    private String name;
}
