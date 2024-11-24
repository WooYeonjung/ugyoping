package com.example.demo.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.board.model.dto.BoardDTO;
import com.example.demo.board.model.vo.BoardVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import mapperInterface.BoardMapper;

@AllArgsConstructor
@Service
@Log4j2
public class BoardServiceImpl implements BoardService {
	
	BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getBoardList() {
		List<BoardDTO> dto =  boardMapper.findAll();
		List<BoardVO> result = dto.stream().map(d ->  new BoardVO(d.getId(),d.getUserId(),d.getTitle(),d.getContent(),d.getCnt(),d.getCreatedAt(),d.getUpdatedAt(),d.getStatus())).toList();
		
		return result;
	}
}
