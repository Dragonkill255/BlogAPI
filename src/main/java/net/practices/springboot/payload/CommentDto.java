package net.practices.springboot.payload;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CommentDto {
    private  long id;
    @NotEmpty
    private String name;
    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    @Size(min = 10,message = "body must be at least 10 characters")
    private String body;

}
