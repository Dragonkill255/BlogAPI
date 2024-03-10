package net.practices.springboot.payload;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
public class PostDto {
    private Long id;

    @NotEmpty
    @Size(min=2,message = "Title must have at least 2 characters")
    private String title;

    @NotEmpty(message = "Description should not be null or empty")
    @Size(min=10,message = "Description must have at least 10 characters")
    private String description;

    @NotEmpty
    private String content;
    private Set<CommentDto> comments;
}
