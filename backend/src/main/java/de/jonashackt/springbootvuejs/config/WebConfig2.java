package de.jonashackt.springbootvuejs.config;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class WebConfig2 implements WebMvcConfigurer {

   @Override
   public void configureViewResolvers(ViewResolverRegistry registry) {
//      registry.jsp("/WEB-INF/views/", ".jsp");
   }

   @Override
   public void addResourceHandlers(ResourceHandlerRegistry registry) {
	   System.out.println("== " + this.getClass().getName());
      // Register resource handler for CSS and JS
//      registry.addResourceHandler("/examples/**").addResourceLocations("classpath:/examples/")
//            .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());

   }
}