package com.example.inobao.domain.post.repository;

import com.example.inobao.domain.comment.entity.QComment;
import com.example.inobao.domain.post.dto.PostResponseDto;
import com.example.inobao.domain.post.entity.QPost;
import com.example.inobao.domain.user.entity.QUser;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

/*
    PostDto
    private final Long id;
    private final String nickname;
    private final String contents;
    private final LocalDateTime createdDate;
    private final LocalDateTime modifiedDate;
    private final List<CommentResponseDto> commentList;
    private final List<String> imageUrls;
    private final int likeCount;
    private boolean isLiked;

    CommentDto
    private final Long id;
    private final String content;
    private final String nickname;
    private final LocalDateTime createdDate;
    private final LocalDateTime modifiedDate;
    private final int likeCount;
    private boolean isLiked;
 */
@RequiredArgsConstructor
public class PostCustomRepositoryImpl implements PostCustomRepository {
    private final JPAQueryFactory queryFactory;

    @Override
    public List<PostResponseDto> findAllPost() {
        QPost post = QPost.post;
        QUser user = QUser.user;
        QComment comment = QComment.comment;
//        JPASQLQuery<PostResponseDto> query = queryFactory.select(
//                        Expressions.as(new QPostResponseDto(
//                                        post.id,
//                                        user.nickname,
//                                        post.content,
//                                        post.createdDate,
//                                        post.modifiedDate,
//                                        comment.count(),
//                                        post.likeCount,
//                                        post.isLiked
//                                ), PostResponseDto.class
//                        )
//                )
//                .from(post)
//                .leftJoin(user).on(post.user.id.eq(user.id))
//                .leftJoin(comment).on(post.id.eq(comment.post.id))
//                .groupBy(post.id);
//        return query.fetch();

        return null;
    }
}
