package gcp.admin.common.strategy;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.security.web.session.InvalidSessionStrategy;
import org.springframework.security.web.util.matcher.ELRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.util.StringUtils;

import intune.gsf.common.constants.BaseConstants;

public class CustomInvalidSessionStrategy implements InvalidSessionStrategy {
	private Logger			logger			= LoggerFactory.getLogger(getClass());
	private RequestMatcher	requestMatcher	= new ELRequestMatcher("hasHeader('X-Requested-With','XMLHttpRequest')");
	private String			AjaxHaders		= "Ajax";

	public void onInvalidSessionDetected(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		boolean ajaxRedirect = requestMatcher.matches(request);
		String ajaxYn = request.getHeader(AjaxHaders);
		logger.debug("=============== header ajax : " + ajaxYn);
		if (ajaxRedirect || "Y".equals(ajaxYn)) {
			logger.debug("Session expired due to ajax request, starting a new session and redirect to requested status '{}'",
					901);
			response.setContentType(MediaType.APPLICATION_JSON_VALUE);
			response.sendError(BaseConstants.SESSION_TIMEOUT_ERROR, BaseConstants.SESSION_TIMEOUT_ERROR_INFO);

		} else {
			String requestURI = getRequestUrl(request);
			logger.debug("Session expired due to non-ajax request, starting a new session and redirect to requested url '{}'",
					requestURI);
			request.getSession(true);
			response.sendRedirect(requestURI);
		}

	}

	private String getRequestUrl(HttpServletRequest request) {
		StringBuffer requestURL = request.getRequestURL();

		String queryString = request.getQueryString();
		if (StringUtils.hasText(queryString)) {
			requestURL.append("?").append(queryString);
		}

		return requestURL.toString();
	}

}