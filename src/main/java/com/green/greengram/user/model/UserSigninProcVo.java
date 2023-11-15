package com.green.greengram.user.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSigninProcVo { // db에서 부터 가져온 데이터를 담을 Vo
    private int iuser;
    private String nm;
    private String pic;
    private String upw;
}
