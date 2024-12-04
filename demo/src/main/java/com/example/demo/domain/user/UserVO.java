package com.example.demo.domain.user;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class UserVO {
	private final Long id;
	private final String email;
	private final String name;
	private final String profilePicture;
	private final String provider;
	private final String providerId;
	private final LocalDateTime created_at;
	private final LocalDateTime updated_at;
}
