package ru.mpei.nti.common;

import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author Artur Dzhanaev
 * @created 12.02.2023
 */
@Slf4j
public class ServletInit extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {return new Class[0];}

    @Override
    protected Class<?>[] getServletConfigClasses() {return new Class[0];}

    @Override
    protected String @NotNull [] getServletMappings() {return new String[0];}
}
