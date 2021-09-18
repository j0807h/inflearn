package com.jh.mvc.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jh.mvc.domain.Board;



/**
 * FileName : BoardRepository.java
 * Comment : 게시판 Repository
 * @author : CJH
 * @date : 2021. 9. 18.
 *
 */
@Repository
public interface BoardRepository {
	
	List<Board> getList();
	
	Board get(int boardSeq);
	
	void save(Board board);
	
	void update(Board board);
	
	void delete(int boardSeq);
}
