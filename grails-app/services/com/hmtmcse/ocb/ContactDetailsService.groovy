package com.hmtmcse.ocb


class ContactDetailsService {


    private def getContactDetailsParamsParse(Contact contact, def params, Integer id = null) {
        def map = [
                id     : null,
                mobile : null,
                phone  : null,
                email  : null,
                website: null,
                address: null,
                type   : null,
                contact: contact,
        ]

        if (id == null && params.detailsId) {
            map.id = params.detailsId
        }else if (id != null){
            try{
                if (params["detailsId"][id]){
                    map.id = params["detailsId"][id]
                }
            }catch(Exception e){}
        }

        if (id == null && params.mobile) {
            map.mobile = params.mobile
        }else if (id != null && params["mobile"][id]){
            map.mobile = params["mobile"][id]
        }

        if (id == null && params.phone) {
            map.phone = params.phone
        }else if (id != null && params["phone"][id]){
            map.phone = params["phone"][id]
        }

        if (id == null && params.email) {
            map.email = params.email
        }else if (id != null && params["email"][id]){
            map.email = params["email"][id]
        }

        if (id == null && params.website) {
            map.website = params.website
        }else if (id != null && params["website"][id]){
            map.website = params["website"][id]
        }

        if (id == null && params.address) {
            map.address = params.address
        }else if (id != null && params["address"][id]){
            map.address = params["address"][id]
        }

        if (id == null && params.type) {
            map.type = params.type
        }else if (id != null && params["type"][id]){
            map.type = params["type"][id]
        }

        map.contact = contact
        return map
    }

    private def saveOrUpdate(def map){
        ContactDetails contactDetails
        if (map && map.id) {
            contactDetails = getById(map.id) ?: new ContactDetails()
            contactDetails.properties = map
        } else {
            contactDetails = new ContactDetails(map)
        }
        contactDetails.save(flush: true)
    }


    def createOrUpdateDetails(Contact contact, def params) {
        if (params.type instanceof String) {
            saveOrUpdate(getContactDetailsParamsParse(contact, params))
        } else if (params.type && params.type.getClass().isArray()) {
            Integer index = 0
            params.type.each {
                saveOrUpdate(getContactDetailsParamsParse(contact,  params, index))
                index++
            }
        }
    }


    def getById(Serializable id){
        return ContactDetails.get(id)
    }

    def deleteContactDetails(Serializable id) {
        ContactDetails contactDetails = getById(id)
        if (contactDetails) {
            contactDetails.delete(flush: true)
            return AppUtil.infoMessage("Deleted")
        }
        return AppUtil.infoMessage("Unable to Delete", false)
    }

    def getContactDetailsListByContact(Contact contact) {
        if (contact) {
            return ContactDetails.createCriteria().list {
                eq("contact", contact)
            }
        }
        return []
    }

}
