package de.jonashackt.springbootvuejs.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

@Component
public class CustomContainer implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {

	/**
	 * 
	 */
	private final WebConfig CustomContainer;

	/**
	 * @param webConfig
	 */
	CustomContainer(WebConfig webConfig) {
		CustomContainer = webConfig;
	}

	@Override
	public void customize(TomcatServletWebServerFactory factory) {
		Map<String, String> map = new HashMap<>();
		map.put("listings", "true");
		factory.setInitParameters(map);
	}
}