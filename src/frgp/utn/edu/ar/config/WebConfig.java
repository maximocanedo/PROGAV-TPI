package frgp.utn.edu.ar.config;

import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebConfig {
	
	/*@Bean(name="entityManagerFactory")
	public LocalSessionFactoryBean sessionFactory() {
	    LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();

	    return sessionFactory;
	} */
	
	@Bean
	public DispatcherServletPath dispatcherServletPath() {
		return new DispatcherServletRegistrationBean(dispatcherServlet().getServlet(), "");
	}

    @Bean
    public DispatcherServletRegistrationBean dispatcherServlet() {
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.setConfigLocation("frgp.utn.edu.ar.config");

        DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
        DispatcherServletRegistrationBean servletRegistrationBean = new DispatcherServletRegistrationBean(dispatcherServlet, "*.html");
        servletRegistrationBean.setLoadOnStartup(1);
        servletRegistrationBean.setName("spring");

        return servletRegistrationBean;
    }
    
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
/*
    @Bean
    public ContextLoaderListener contextLoaderListener() {
        return new ContextLoaderListener();
    } */
}
