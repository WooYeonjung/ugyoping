package com.example.demo.web.board.dto;

import com.example.demo.common.model.dto.BaseDTO;
import com.example.demo.domain.board.BoardStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BoardDTO extends BaseDTO{
	private Long id; 
	private Long userId; 
	private String title; 
	private String content; 
	private int cnt;
	private  BoardStatus status;
}
