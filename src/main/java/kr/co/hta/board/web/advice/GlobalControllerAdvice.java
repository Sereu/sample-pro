package kr.co.hta.board.web.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import kr.co.hta.board.web.exception.SimpleBoardException;

@ControllerAdvice
public class GlobalControllerAdvice {

	@ExceptionHandler(SimpleBoardException.class) 
	public String handlerException(SimpleBoardException ex){
		ex.printStackTrace();
		return "error/500.jsp";
	}
	// 보험용
	@ExceptionHandler(Exception.class)
	public String handlerException(Exception ex) {
		ex.printStackTrace();
		return "error/500.jsp";
	}
}
