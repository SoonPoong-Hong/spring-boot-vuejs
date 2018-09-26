package de.jonashackt.springbootvuejs.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyFilter implements Filter {
	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	private FilterConfig filterConfig;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException,
			ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;

		String uri = request.getRequestURI();
		String remoteAddr = request.getRemoteAddr();
		logger.warn("== {}", uri);
		chain.doFilter(request, response);

//		LoginUser loginUser = LoginUserHolder.register(request);
//		try {
//			chain.doFilter(request, response);
//		} finally {
//			LoginUserHolder.clea();
//		}
	}


	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
