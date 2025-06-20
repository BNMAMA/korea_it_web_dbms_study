package com.koreait.dbms_study.dto;

import com.koreait.dbms_study.entity.Post;

import java.time.LocalDateTime;

public class AddPostJpaReqDto {
    private String title;
    private String content;
    private Integer userId;

    public Post toJpaEntity() {
        return Post.builder()
                .title(this.title)
                .content(this.content)
                .userId(this.userId)
                .createDt(LocalDateTime.now())
                .build();
    }
}
