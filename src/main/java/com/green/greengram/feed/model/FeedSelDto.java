package com.green.greengram.feed.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class FeedSelDto { // 페이징 처리
    private int startIdx;
    private int rowCount;
}
