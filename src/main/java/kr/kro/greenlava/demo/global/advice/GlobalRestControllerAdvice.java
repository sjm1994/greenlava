package kr.kro.greenlava.demo.global.advice;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import groovy.util.logging.Slf4j;
import kr.kro.greenlava.demo.global.api.JwtRestApi;

@Slf4j
@RestControllerAdvice(basePackageClasses = JwtRestApi.class)
public class GlobalRestControllerAdvice {
	private static Logger logger = LoggerFactory.getLogger(GlobalRestControllerAdvice.class);

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> exceptionHandler(Exception e) {
		logger.error("unknown exception : " + e.getMessage());
		
		return new ResponseEntity<Object>(HttpStatus.EXPECTATION_FAILED);
	}
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<Map<String, Object>> runtimeExceptionHandler(Exception e) {
		Map<String, Object> body = new HashMap<>();
		
		logger.error("runtimeException : " + e.getMessage());
		body.put("msg", e.getMessage());
		
		return new ResponseEntity<Map<String, Object>>(body, HttpStatus.EXPECTATION_FAILED);
	}
	
}
