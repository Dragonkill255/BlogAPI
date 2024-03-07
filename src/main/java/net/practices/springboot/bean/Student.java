package net.practices.springboot.bean;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private int id;
    private String firstName;
    private String lastName;


}
