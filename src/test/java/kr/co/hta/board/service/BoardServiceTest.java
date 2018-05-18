package kr.co.hta.board.service;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import kr.co.hta.board.vo.Board;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/META-INF/spring/test-root-context.xml")
@Transactional
public class BoardServiceTest {

	@Autowired
	BoardService boardService;
	
	@Test
	public void testConfig() {
		assertThat(boardService, notNullValue());
	}
	//모든 글을 조회하는 메소드가 잘 동작하는지 확인하는 테스트 메소드
	@Test
	public void testGetAllBoards() {
		
		List<Board> allBoards = boardService.getAllBoards();
		assertThat(allBoards, notNullValue());
	}
	//특정한 글번호에 해당하는 글을 조회하는 메소드가 잘 동작하는지 확인하는 테스트 메소드
	@Test
	public void testGetBoard() {
		
		Board board = boardService.getBoardDetail(134);
		assertThat(board, notNullValue());
	}
	
}
