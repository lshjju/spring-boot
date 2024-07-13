package com.apple.shop.member;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@ToString
public class Member {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long id;
  @Column(unique = true)
  public String username;
  public String displayName;
  public String password;

  @OneToMany(mappedBy = "member")
  List<Sales> sales = new ArrayList<>();

  
} 
