package com.crud.tasks.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Setter
@NoArgsConstructor
@Getter
@Entity(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String title;
    @Column(name = "description")
    private String content;

    public Task(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
