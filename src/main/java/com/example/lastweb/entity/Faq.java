package com.example.lastweb.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Faq {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer faq_id;

  @Column(name = "title")
  private String title;

  @Column(name = "content")
  private String content;

  @Column(name = "created_at")
  private String   created_at;


}
