package com.example.pepega.controller.v1;


import com.example.pepega.entity.User;
import com.example.pepega.repo.UserJpaRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor // class 내부의 final 객체는 Constructor Injection 수행, @Autowired도 가능
@RestController // 결과를 JSON으로 도출
@RequestMapping(value = "/v1") // api resource를 버전별로 관리, /v1 을 모든 리소스 주소에 적용
public class UserController {

    private final UserJpaRepo userJpaRepo;

    @GetMapping(value = "/user") // user 테이블의 모든 정보를 읽어옴
    public List<User> findAllUser() { // 데이터가 1개 이상일 수 있기에 List<User>로 선언
        return userJpaRepo.findAll(); // JPA를 사용하면 CRUD에 대해 설정 없이 쿼리 사용 가능 (select * from user 와 같음)
    }

    @PostMapping(value = "/user") // user 테이블에 데이터를 입력하는 부분 insert into user (msrl, name, uid) values (null, ?, ?) 와 같음
    public User save() {
        User user = User.builder()
                .uid("pepe@sadfrog.com") // User 클래스에서 만들어진 변수 uid, name
                .name("페페")
                .build();

        return userJpaRepo.save(user);
    }
}
