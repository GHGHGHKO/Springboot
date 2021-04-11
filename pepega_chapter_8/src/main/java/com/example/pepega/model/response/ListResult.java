package com.example.pepega.model.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ListResult<T> extends CommonResult {
    // List 형태로 여러 데이터를 받음
    // CommonResult를 상속받아 API 요청 결과도 같이 출력

    private List<T> list;
}
