package frgp.utn.edu.ar.config;

import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class WebConfig {
	
	
	@Bean
	public DispatcherServletPath dispatcherServletPath() {
		return new DispatcherServletRegistrationBean(dispatcherServlet().getServlet(), "");
	}

    @Bean
    public ServletRegistrationBean<DispatcherServlet> dispatcherServlet() {
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.setConfigLocation("frgp.utn.edu.ar.config");

        DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
        ServletRegistrationBean<DispatcherServlet> servletRegistrationBean = new ServletRegistrationBean<>(dispatcherServlet, "*.html");
        servletRegistrationBean.setLoadOnStartup(1);
        servletRegistrationBean.setName("spring");

        return servletRegistrationBean;
    }

    @Bean
    public ContextLoaderListener contextLoaderListener() {
        return new ContextLoaderListener();
    }
}
