package net.practices.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
//Unique constraint khai bao mot cot duy nhat
@Table(name = "posts", uniqueConstraints = {@UniqueConstraint(columnNames = {"table"})})
public class Post {

    @Id
    private Long id;
    private String title;
    private String description;
    private String content;
}
