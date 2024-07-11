package com.apple.shop.sales;

import jakarta.persistence.Entity;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
public class Sales {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String ItemName;
  private Integer price;
  private Integer count;
  private Long memberId;
  @CreationTimestamp
  private LocalDateTime created;
}
