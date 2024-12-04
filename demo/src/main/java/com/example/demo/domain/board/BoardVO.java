package com.example.demo.domain.board;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BoardVO {
	private final Long id; 
	private final Long userId; 
	private final String title; 
	private final String content; 
	private final int cnt;
	private final LocalDateTime createdAt; 
	private final LocalDateTime updatedAt; 
	private final BoardStatus status;
	
	
	
}
