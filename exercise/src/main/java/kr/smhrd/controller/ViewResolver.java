package kr.smhrd.controller;

public class ViewResolver {
	public static String makeURL(String nextVew) {
		return "WEB-INF/"+nextVew+".jsp";//뷰의 물리적인 경로
	}
}
