package com.hmtmcse.ocb


class ContactGroupController {

    ContactGroupService contactGroupService

    def index() {
        def response = contactGroupService.list(params)
        [contactGroups: response.list, total: response.count]
    }

    def details(Integer id) {
        def response = contactGroupService.get(id)
        if (!response) {
            redirect(controller: "contactGroup", action: "index")
        } else {
            [contactGroup: response]
        }
    }

    def create() {
        [contactGroup: flash.redirectParams]
    }

    def save() {
        def response = contactGroupService.save(params)
        if (response.isSuccess) {
            flash.message = AppUtil.infoMessage(g.message(code: "saved"))
            redirect(controller: "contactGroup", action: "index")
        } else {
            flash.redirectParams = response.model
            flash.message = AppUtil.infoMessage(g.message(code: "unable.to.save"), false)
            redirect(controller: "contactGroup", action: "create")
        }
    }

    def edit(Integer id) {
        if (flash.redirectParams) {
            [contactGroup: flash.redirectParams]
        } else {
            def response = contactGroupService.get(id)
            if (!response) {
                flash.message = AppUtil.infoMessage(g.message(code: "invalid.entity"), false)
                redirect(controller: "contactGroup", action: "index")
            } else {
                [contactGroup: response]
            }
        }
    }

    def update() {
        def response = contactGroupService.get(params.id)
        if (!response) {
            flash.message = AppUtil.infoMessage(g.message(code: "invalid.entity"), false)
            redirect(controller: "contactGroup", action: "index")
        } else {
            response = contactGroupService.update(response, params)
            if (!response.isSuccess) {
                flash.redirectParams = response.model
                flash.message = AppUtil.infoMessage(g.message(code: "unable.to.update"), false)
                redirect(controller: "contactGroup", action: "edit")
            } else {
                flash.message = AppUtil.infoMessage(g.message(code: "updated"))
                redirect(controller: "contactGroup", action: "index")
            }
        }
    }

    def delete(Integer id) {
        def response = contactGroupService.get(id)
        if (!response) {
            flash.message = AppUtil.infoMessage(g.message(code: "invalid.entity"), false)
            redirect(controller: "contactGroup", action: "index")
        } else {
            response = contactGroupService.delete(response)
            if (!response) {
                flash.message = AppUtil.infoMessage(g.message(code: "unable.to.delete"), false)
            } else {
                flash.message = AppUtil.infoMessage(g.message(code: "deleted"))
            }
            redirect(controller: "contactGroup", action: "index")
        }
    }

}
