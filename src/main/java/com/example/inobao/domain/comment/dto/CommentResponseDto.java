package com.example.inobao.domain.comment.dto;

import com.example.inobao.domain.comment.entity.Comment;
import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommentResponseDto {
    private final Long id;
    private final String content;
    private final String nickname;
    private final LocalDateTime createdDate;
    private final LocalDateTime modifiedDate;
    private final int likeCount;
    private boolean isLiked;

    @QueryProjection
    public CommentResponseDto(Long id, String content, String nickname, LocalDateTime createdDate, LocalDateTime modifiedDate, int likeCount, boolean isLiked) {
        this.id = id;
        this.content = content;
        this.nickname = nickname;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.likeCount = likeCount;
        this.isLiked = isLiked;
    }

    public CommentResponseDto(Comment comment) {
        this.id = comment.getId();
        this.content = comment.getContent();
        this.nickname = comment.getUser().getNickname();
        this.createdDate = comment.getCreatedDate();
        this.modifiedDate = comment.getModifiedDate();
        this.likeCount = comment.getLikeCount();
    }

    public void modifyIsLiked(boolean liked) {
        this.isLiked = liked;
    }
}
