package com.green.greengram.user.model;

import lombok.Data;

@Data
// Data 안에 @ToString, @EqualsAndHashCode, @Getter, @Setter, @RequiredArgsConstructor
public class UserInsDto {
    private String uid;
    private String upw;
    private String nm;
    private String pic;
}
