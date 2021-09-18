package com.jh.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jh.mvc.domain.Board;
import com.jh.mvc.repository.BoardRepository;


/**
 * FileName : BoardService.java
 * Comment : 게시판 서비스	
 * @author : CJH
 * @date : 2021. 9. 18.
 *
 */
@Service
public class BoardService {
	@Autowired
	private BoardRepository repository;

	/**
	 * 목록 리턴.
	 * 
	 * @return
	 */
	public List<Board> getList() {
		return repository.getList();
	}

	/**
	 * 상세 정보 리턴.
	 * 
	 * @param boardSeq
	 * @return
	 */
	public Board get(int boardSeq) {
		return repository.get(boardSeq);
	}

	/**
	 * 등록 처리.
	 * 
	 * @param board
	 */
	public void save(Board board) {
		repository.save(board);
//		// 조회하여 리턴된 정보
//		Board board = repository.get(parameter.getBoardSeq());
//		if (board == null) {
//			repository.save(parameter);
//		} else {
//			repository.update(parameter);
//		}
	}
	
	/**
	 * 수정 처리.
	 * 
	 * @param board
	 */
	public void update(Board board) {
		repository.update(board);
	}

	/**
	 * 삭제 처리.
	 * 
	 * @param boardSeq
	 */
	public void delete(int boardSeq) {
		repository.delete(boardSeq);
	}
}
