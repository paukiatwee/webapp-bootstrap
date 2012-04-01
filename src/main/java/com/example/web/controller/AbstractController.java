/**
 * 
 */
package com.example.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;


/**
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 *
 */
abstract class AbstractController {
    
    protected String defaultPath;
    protected String redirect;
    protected String list;
    protected String redirectList;
    protected String find;

    public AbstractController() {
        defaultPath = getDefaultPath();
        redirect = getRedirectDefaultPath();
        redirectList = getRedirectList();
        list = getListPath();
        find = getFindPath();
    }
    private String getFindPath() {
        return "redirect:/" + getDefaultPath() + "/find/";
    }
    protected String getRedirectList() {
        return "redirect:/" + getDefaultPath() + "/list";
    }
    protected abstract String getDefaultPath();
    
    protected String getRedirectDefaultPath() {
        return "redirect:/" + getDefaultPath();
    }
    
    protected String getListPath() {
        return getDefaultPath() + "-list";
    }
    
    protected void createSuccessSession(HttpSession session) {
        successSession("create", session);
    }
    
    protected void successSession(final String key, HttpSession session) {
        if(session != null) {
            session.setAttribute(key + ".success", "true");
        }
    }
    
    protected boolean isPreviousSuccess(final String key, HttpSession session) {
        if(session != null) {
            Object value = session.getAttribute(key + ".success");
            session.removeAttribute(key + ".success");
            if("true".equals(value)) {
                return true;
            }
        }
        
        return false;
    }
    
    protected boolean isPreviousCreateSuccess(HttpSession session) {
        return isPreviousSuccess("create", session);
    }
    
    protected void updateSuccessSession(HttpSession session) {
        successSession("update", session);
    }
    protected boolean isPreviousUpdateSuccess(HttpSession session) {
        return isPreviousSuccess("update", session);
    }
    protected void deleteSuccessSession(HttpSession session) {
        successSession("delate", session);
    }
    protected boolean isPreviousDeleteSuccess(HttpSession session) {
        return isPreviousSuccess("delete", session);
    }
    protected final String doDefault(Model m, HttpSession session) {
        m.addAttribute("model", getModel());
        m.addAttribute("isCreateSuccess", isPreviousCreateSuccess(session));
        return defaultPath;
    }
    
    protected abstract Object getModel();

}
