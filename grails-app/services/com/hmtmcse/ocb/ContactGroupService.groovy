package com.hmtmcse.ocb

import grails.web.servlet.mvc.GrailsParameterMap


class ContactGroupService {

    AuthenticationService authenticationService

    def save(def params) {
        ContactGroup contactGroup = new ContactGroup(params)
        contactGroup.member = authenticationService.getMember()
        def response = AppUtil.saveResponse(false, contactGroup)
        if (contactGroup.validate()) {
            response.isSuccess = true
            contactGroup.save()
        }
        return response
    }

    def update(ContactGroup contactGroup, GrailsParameterMap params) {
        contactGroup.properties = params
        def response = AppUtil.saveResponse(false, contactGroup)
        if (contactGroup.validate()) {
            response.isSuccess = true
            contactGroup.save(flush:true)
        }
        return response
    }

    def get(Serializable id) {
        return ContactGroup.get(id)
    }

    def list(GrailsParameterMap params) {
        params.max = params.max?: GlobalConfig.itemsPerPage()
        List<ContactGroup> contactGroupList = ContactGroup.createCriteria().list(params) {
            if (params?.colName && params?.colValue){
                like(params.colName, "%" +  params.colValue + "%")
            }
            if (!params.sort){
                order("id","desc")
            }
            eq("member", authenticationService.getMember())
        }
        return [list:contactGroupList, count:contactGroupList.totalCount]
    }


    def getGroupList(){
        return ContactGroup.createCriteria().list {
            eq("member", authenticationService.getMember())
        }
    }

    def cleanGroupContactById(Integer id){
        ContactGroup contactGroup = ContactGroup.get(id)
        contactGroup.contact.each {contact ->
            contact.removeFromContactGroup(contactGroup)
        }
        contactGroup.save(flush:true)
    }


    def delete(ContactGroup contactGroup) {
        try {
            cleanGroupContactById(contactGroup.id)
            contactGroup.delete(flush: true)
        } catch (Exception e) {
            println(e.getMessage())
            return false
        }
        return true
    }



}
