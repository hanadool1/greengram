package com.green.greengram.user.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSigninVo { // json으로 응답할 때 사용
    private int result; // 로그인 성공(1), 아이디 없음(2), 비밀번호 다름(3)
    private int iuser;
    private String nm;
    private String pic;

}
