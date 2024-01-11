package com.estore.session;

import jakarta.servlet.http.Cookie;

public class SessionManager {

	public static Boolean doesCookieExist(String cookieName, Cookie[] cookies) {

		Boolean result = false;
		if (cookies != null) {
			for (Cookie c : cookies) {

				if (c.getName().equals(cookieName)) {
					result = true;
				}
			}
		}
		return result;

	}

}
