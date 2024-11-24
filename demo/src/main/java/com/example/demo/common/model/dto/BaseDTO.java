package com.example.demo.common.model.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseDTO {
	private LocalDateTime createdAt; 
	private LocalDateTime updatedAt;
}