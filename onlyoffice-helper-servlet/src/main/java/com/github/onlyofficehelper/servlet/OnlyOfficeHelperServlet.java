package com.github.onlyofficehelper.servlet;


import com.github.onlyofficehelper.ds.builder.ConfigurationReader;
import com.github.onlyofficehelper.ds.builder.PropertiesConfigurationReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * OnlyOffice核心servlet
 * </p>
 *
 * @author EricChen 2020/10/12 14:12
 */
public class OnlyOfficeHelperServlet extends OnlyOfficeDispatcherServlet {
    protected ConfigurationReader configurationBuilder;

    @Override
    public void init() throws ServletException {
        configurationBuilder = new PropertiesConfigurationReader();
    }

    @Override
    protected void doView(HttpServletRequest request, HttpServletResponse response) {
    }

    @Override
    protected void doEdit(HttpServletRequest request, HttpServletResponse response) {
    }

    @Override
    protected void doReview(HttpServletRequest request, HttpServletResponse response) {
    }

    @Override
    protected void doConvert(HttpServletRequest request, HttpServletResponse response) {

    }

    @Override
    protected void doTrack(HttpServletRequest request, HttpServletResponse response) {

    }
}
