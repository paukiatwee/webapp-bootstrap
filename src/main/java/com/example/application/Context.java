/**
 * 
 */
package com.example.application;

import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

/**
 * A class set properties to servlet context to
 * enble access the data at jsp.
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 *
 */
public class Context implements ServletContextAware, InitializingBean {

    private ServletContext servletContext;
    private Map<String, String> properties;
    @Override
    public void afterPropertiesSet() throws Exception {
        for(Entry<String, String> property: properties.entrySet()) {
            System.out.println("==================================");
            System.out.println(property);
            servletContext.setAttribute(property.getKey(), property.getValue());
        }
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }
    
    public void setProperties(final Map<String, String> properties) {
        this.properties = properties;
    }

}
