package com.green.greengram.feed.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class FeedPicsInsProcDto { // 피드픽스테이블에 insert할 때 필요한 것만 적음
    // 박스갈이 2
    private int ifeed;
    private List<String> pics;

//    public FeedPicsInsProcDto(int ifeed, List<String> pics) {
//        this.ifeed = ifeed;
//        this.pics = pics;
//    }
}
