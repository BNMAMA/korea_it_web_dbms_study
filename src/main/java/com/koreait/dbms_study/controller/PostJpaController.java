package com.koreait.dbms_study.controller;

import com.koreait.dbms_study.dto.AddPostReqDto;
import com.koreait.dbms_study.dto.EditPostReqDto;
import com.koreait.dbms_study.service.PostJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/*
 JPA
 객체 중심의 ORM(Object Relational Mapping)
 객체 지향 언어(JAVA) 의 객체와 관계형 데이터베이스의 테이블간의 매핑을 자동으로 처리
 -> SQL을 직접 쓰지 않고 자바 객체 중심으로 DB를 다룸
 Hibernate는 JPA의 구현체 이다
 JPA: 자바에서 ORM을 사용할 수 있게 만든 인터페이스
 장점 => SQL없이 빠르게 CRUD가능 , 코드량 줄어든다
 단점 => 복잡한 쿼리는 어렵고 추적/ 디버깅이 까다롭다.
 */
public class PostJpaController {

    @Autowired
    private PostJpaService postJpaService;

    @PostMapping("/add")
    public ResponseEntity<?> addPost(@RequestBody AddPostReqDto addPostReqDto) {
        return ResponseEntity.ok(postJpaService.addPost(addPostReqDto));
    }

    @PostMapping("/edit")
    public ResponseEntity<?> editPost(@RequestBody EditPostReqDto editPostReqDto) {
        return ResponseEntity.ok(postJpaService.editPost(editPostReqDto));
    }

    @PostMapping("/remove")
    public ResponseEntity<?> removePost(@RequestParam Integer postId) {
        return ResponseEntity.ok(postJpaService.removePost(postId));
    }
}
