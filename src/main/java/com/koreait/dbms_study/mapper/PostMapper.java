package com.koreait.dbms_study.mapper;

import com.koreait.dbms_study.entity.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PostMapper {
    int addPost(Post post); //post 조회
    Optional<Post> getPostByPostId(Integer postId); //id검색 -> post검색


    int editPost(Post post); //post수정

    int removePost(Integer post); //삭제


    List<Post> getPostList(); //post리스트 전체 보기
}
