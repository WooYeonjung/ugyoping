package com.example.demo.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.board.service.BoardService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
@RequestMapping("/board")
public class BoardController {
	
	private BoardService boardService;
	
	@GetMapping("")
	public String boardList(Model model) {
		
		model.addAttribute("boardList", boardService.getBoardList());
		return "board/boardList";
	}
	@GetMapping("/boardWriteForm")
	public void boardWriteForm(Model model) {

	}
}
