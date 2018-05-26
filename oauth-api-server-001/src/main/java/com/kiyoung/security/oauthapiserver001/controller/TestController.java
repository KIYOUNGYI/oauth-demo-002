package com.kiyoung.security.oauthapiserver001.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 권한 코드 테스트를 위해 만든 컨트롤러
 */
@Controller
@RequestMapping("test")
class TestController {
	@RequestMapping("authorization-code")
	@ResponseBody
	public String authorizationCodeTest(@RequestParam("code") String code) {
		String curl = String.format("curl " + "-F \"grant_type=authorization_code\" " + "-F \"code=%s\" "
				+ "-F \"scope=read\" " + "-F \"client_id=foo\" " + "-F \"client_secret=bar\" "
				+ "-F \"redirect_uri=http://localhost:8080/test/authorization-code\" "
				+ "\"http://foo:bar@localhost:8080/oauth/token\"", code);
		return curl;
	}
}
