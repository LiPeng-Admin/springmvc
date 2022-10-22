package com.atguigu.mvc.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @author lipeng
 * @version 1.0
 * @description: web工程的初始化类，用来代替web.xml
 * @date 2022/10/22 11:41
 */
public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * @description: 指定spring配置类
     * @author lipeng
     * @date
     * @version 1.0
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    /**
     * @description: 指定springMVC配置类
     * @author lipeng
     * @date
     * @version 1.0
     */

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }
    /**
     * @description: 指定DispatchServlet的映射规则，即url-pattern
     * @author lipeng
     * @date
     * @version 1.0
     */

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
    /**
     * @description: 注册过滤器
     * @author lipeng
     * @date
     * @version 1.0
     */

    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceResponseEncoding(true);
        HiddenHttpMethodFilter hiddenHttpMethodFilter = new HiddenHttpMethodFilter();

        return new Filter[]{characterEncodingFilter,hiddenHttpMethodFilter};
    }
}
