package com.example.inobao.domain.post.repository;

import com.example.inobao.domain.post.dto.PostResponseDto;

import java.util.List;

public interface PostCustomRepository {
    List<PostResponseDto> findAllPost();
}
