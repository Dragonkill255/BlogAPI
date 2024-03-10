package net.practices.springboot.service;

import net.practices.springboot.payload.CommentDto;
import net.practices.springboot.payload.PostDto;
import net.practices.springboot.payload.PostResponse;

import java.util.List;

public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);
    List<CommentDto> getCommentByPostId(long postId);

    CommentDto getCommentById(long postId, long commentId);

    CommentDto updateComment(long postId,long commentId, CommentDto commentDto);

    void deleteComment(long postId, long commentId);




}
