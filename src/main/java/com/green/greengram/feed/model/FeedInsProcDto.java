package com.green.greengram.feed.model;

import com.green.greengram.ResVo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;

@Getter
@Setter
@ToString
public class FeedInsProcDto {  // 피드테이블에 insert 할 때 필요한 것만 적음
    // 박스갈이 1 : swagger문서(프론트에게 보내는 문서)가 더러워지는 것을 방지,
    private int ifeed;
    private int iuser;
    private String contents;
    private String location;

    public FeedInsProcDto(FeedInsDto dto) {
        this.iuser = dto.getIuser();
        this.contents = dto.getContents();
        this.location = dto.getLocation();
    }

}
