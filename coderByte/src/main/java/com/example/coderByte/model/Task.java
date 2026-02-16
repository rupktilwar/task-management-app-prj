package com.example.coderByte.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 100, message = "Title max 100 chars")
    @Column(nullable = false)
    private String title;

    private String description;

    private boolean completed  = false;

    private LocalDateTime dueDate;
}
