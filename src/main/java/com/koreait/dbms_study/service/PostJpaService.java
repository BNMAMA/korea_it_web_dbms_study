package com.koreait.dbms_study.service;

import com.koreait.dbms_study.dto.AddPostReqDto;
import com.koreait.dbms_study.entity.JpaPost;
import com.koreait.dbms_study.repositoty.PostJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PostJpaService<JpaPostPost> {

    @Autowired
    private PostJpaRepository postJpaRepository;

    public JpaPost addPost(AddPostReqDto addPostReqDto) {
        return postJpaRepository.save(addPostReqDto.toJpaEntity());
    }

    public List<JpaPost> getPostList() {
        return postJpaRepository.findAll();
    }
}
