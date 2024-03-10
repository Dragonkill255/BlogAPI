package net.practices.springboot.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import net.practices.springboot.payload.CommentDto;
import net.practices.springboot.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/")
public class CommentController {
    private CommentService commentService;
    @PostMapping("/posts/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(@PathVariable(value="postId") long postId,@Valid @RequestBody CommentDto commentDto){
        return new ResponseEntity<>(commentService.createComment(postId,commentDto), HttpStatus.CREATED);
    }

    @GetMapping("/posts/{postId}/comments")
    public ResponseEntity<List<CommentDto>> getCommentByPostId(@PathVariable(value="postId") long postId){
        return new ResponseEntity<>(commentService.getCommentByPostId(postId), HttpStatus.OK);
    }

    @GetMapping("/posts/{postId}/comments/{commentId}")
    public ResponseEntity<CommentDto> getCommentById(@PathVariable(value="postId") long postId,@PathVariable(value="commentId") long commentId){
        return new ResponseEntity<>(commentService.getCommentById(postId,commentId), HttpStatus.OK);
    }

    @PutMapping("/posts/{postId}/comments/{commentId}")
    public ResponseEntity<CommentDto> updateComment(@PathVariable(value="postId") long postId,@PathVariable(value="commentId") long commentId,@Valid @RequestBody CommentDto commentDto){
        return new ResponseEntity<>(commentService.updateComment(postId,commentId,commentDto), HttpStatus.OK);
    }

    @DeleteMapping("/posts/{postId}/comments/{commentId}")
    public ResponseEntity<String> deleteComment(@PathVariable(value="postId") long postId,@PathVariable(value="commentId") long commentId){
        commentService.deleteComment(postId,commentId);
        return new ResponseEntity<>("delete successfully", HttpStatus.OK);
    }
}
