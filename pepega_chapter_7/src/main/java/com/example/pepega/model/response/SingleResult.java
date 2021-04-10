package com.example.pepega.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SingleResult<T> extends CommonResult {
    // CommonResult를 상속받아 API 요청 결과도 같이 출력

    private T data;
}
