package com.hmtmcse.ocb

class ContactController {

    ContactService contactService

    def index() {
        def response = contactService.list(params)
        [contact: response.list, total:response.count]
    }

    def details(Integer id) {
        def response = contactService.get(id)
        if (!response){
            redirect(controller: "contact", action: "index")
        }else{
            [contact: response]
        }
    }

    def create() {
        [contact: flash.redirectParams]
    }

    def save() {
        def response = contactService.save(params, request)
        if (response.isSuccess) {
            flash.message = AppUtil.infoMessage(g.message(code: "saved"))
            redirect(controller: "contact", action: "index")
        } else {
            flash.redirectParams = response.model
            flash.message = AppUtil.infoMessage(g.message(code: "unable.to.save"), false)
            redirect(controller: "contact", action: "create")
        }
    }

    def edit(Integer id) {
        if (flash.redirectParams) {
            [contact: flash.redirectParams]
        } else {
            def response = contactService.get(id)
            if (!response) {
                flash.message = AppUtil.infoMessage(g.message(code: "invalid.entity"), false)
                redirect(controller: "contact", action: "index")
            } else {
                [contact: response]
            }
        }
    }

    def update() {
        def response = contactService.get(params.id)
        if (!response){
            flash.message = AppUtil.infoMessage(g.message(code: "invalid.entity"), false)
            redirect(controller: "contact", action: "index")
        }else{
            response = contactService.update(response, params, request)
            if (!response.isSuccess){
                flash.redirectParams = response.model
                flash.message = AppUtil.infoMessage(g.message(code: "unable.to.update"), false)
                redirect(controller: "contact", action: "edit")
            }else{
                flash.message = AppUtil.infoMessage(g.message(code: "updated"))
                redirect(controller: "contact", action: "index")
            }
        }
    }

    def delete(Integer id) {
        def response = contactService.get(id)
        if (!response){
            flash.message = AppUtil.infoMessage(g.message(code: "invalid.entity"), false)
            redirect(controller: "contact", action: "index")
        }else{
            response = contactService.delete(response)
            if (!response){
                flash.message = AppUtil.infoMessage(g.message(code: "unable.to.delete"), false)
            }else{
                flash.message = AppUtil.infoMessage(g.message(code: "deleted"))
            }
            redirect(controller: "contact", action: "index")
        }
    }
}
