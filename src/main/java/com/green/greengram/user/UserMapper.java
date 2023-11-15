package com.green.greengram.user;

import com.green.greengram.user.model.UserInsDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserInsDto udto);
    String selUserByUid(String uid);

}
