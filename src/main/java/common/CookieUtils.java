package common;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtils {
	public static String get(HttpServletRequest request, String name)
	{
		Cookie[] cookies = request.getCookies();
		if(cookies!=null)
		{
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals(name))
				{
					return cookie.getValue();
				}
			}			
		}
		return null;
	}
	
	public static Cookie add(String name, String value, int hours, HttpServletResponse response)
	{
		Cookie cookie = new Cookie(name, value);
		cookie.setMaxAge(hours*24*24);
		cookie.setPath("/");
		response.addCookie(cookie);
		return cookie;
	}
}