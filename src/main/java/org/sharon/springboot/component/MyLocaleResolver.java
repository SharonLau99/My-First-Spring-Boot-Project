package org.sharon.springboot.component;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Locale;

/**
 * @author sharon
 * @create 2020-08-12-14:52
 */
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        //当没有lang字段指定语言时，会参照spring boot的方法，从浏览器请求头中获得地区信息，若没有，则按照默认来
        String lang = httpServletRequest.getParameter("lang");
        Locale locale = null;
        AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
        locale = localeResolver.resolveLocale(httpServletRequest);

        if (!StringUtils.isEmpty(lang)){
            String[] s = lang.split("_");
            locale = new Locale(s[0], s[1]);
        }

        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
