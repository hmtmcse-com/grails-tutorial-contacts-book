package com.hmtmcse.ocb

import org.grails.web.util.WebUtils

class AppUtil {

    static saveResponse(Boolean isSuccess, def model) {
        return [isSuccess: isSuccess, model: model]
    }

    static getAppSession() {
        return WebUtils.retrieveGrailsWebRequest().session
    }

    static infoMessage(String message, boolean status = true) {
        return [info: message, success: status]
    }

    static String baseURL(){
        return "${getAppSession().getServletContext().getContextPath()}/"
    }
}
