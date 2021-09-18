package com.jh.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jh.mvc.domain.Board;
import com.jh.mvc.service.BoardService;


/**
 * FileName : BoardController.java
 * Comment : 게시판 컨트롤러ㅊ	
 * @author : CJH
 * @date : 2021. 9. 18.
 *
 */
@RestController
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	/*
	 * 목록 리턴
	 * @return
	 */
	@GetMapping
	public List<Board> getList(){
		return boardService.getList();
	}

	/*
	 * 상세정보 리턴
	 * @param boardSeq
	 * @return
	 */
	@GetMapping("/{boardSeq}")
	public Board get(@PathVariable int boardSeq){
		return boardService.get(boardSeq);
	}
	
	/*
	 * 등록/수정 처리
	 * @param board
	 */
	@GetMapping("/save")
	public void save(Board board){
		boardService.save(board);
	}
	
	/*
	 * 삭제 처리
	 * @param boardSeq
	 */
	public void delete(int boardSeq){
		boardService.delete(boardSeq);
	}
	
}
