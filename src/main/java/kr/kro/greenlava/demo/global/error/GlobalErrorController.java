package kr.kro.greenlava.demo.global.error;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;

public class GlobalErrorController implements ErrorController {
	String TEMPLATE_PATH = "/error/";
	
	@RequestMapping(value = "/error")
	public String handleError(HttpServletRequest request) {
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		
		if(status != null){
            int statusCode = Integer.valueOf(status.toString());

            if(statusCode == HttpStatus.NOT_FOUND.value()){
                return TEMPLATE_PATH + "404";
            }
        }
		
		return TEMPLATE_PATH + "error";
	}

}
