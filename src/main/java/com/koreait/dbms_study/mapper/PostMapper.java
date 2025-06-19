package com.koreait.dbms_study.mapper;

import com.koreait.dbms_study.entity.Post;

import java.util.List;

public interface PostMapper {
    int insert(Post post);
    List<Post> getPost();

    int editPost(Post post);

    int removePost(Post post);


}
