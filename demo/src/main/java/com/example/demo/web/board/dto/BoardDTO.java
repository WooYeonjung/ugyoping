package com.example.web.board.dto;

import com.example.demo.board.model.enums.BoardStatus;
import com.example.demo.common.model.dto.BaseDTO;

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
