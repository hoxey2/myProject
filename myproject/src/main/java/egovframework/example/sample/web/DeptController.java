package egovframework.example.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.DeptVO;

@Controller 
// 어노테이션
// @ : 시스템의 주석
public class DeptController {
	
	@RequestMapping(value="/deptWrite.do")
	public String deptWrite() {
		return "dept/deptWrite";
	}
	
	@RequestMapping(value="/deptWriteSave.do")
	public String deptWriteSave(DeptVO vo) {
		
		System.out.println("deptno : " + vo.getDeptno());
		System.out.println("dname : " + vo.getDname());
		System.out.println("loc : " + vo.getLoc());
		
		return "";
	}
}