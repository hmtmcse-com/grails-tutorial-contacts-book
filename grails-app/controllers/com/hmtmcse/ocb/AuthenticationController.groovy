package com.hmtmcse.ocb

class AuthenticationController {

    AuthenticationService authenticationService

    def login() {
        if (authenticationService.isAuthenticated()) {
            redirect(controller: "dashboard", action: "index")
        }
    }


    def doLogin() {
        if (authenticationService.doLogin(params.email, params.password)) {
            redirect(controller: "dashboard", action: "index")
        } else {
            redirect(controller: "authentication", action: "login")
        }
    }


    def logout() {
        session.invalidate()
        redirect(controller: "authentication", action: "login")
    }

}
