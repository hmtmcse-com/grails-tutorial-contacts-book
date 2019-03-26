package com.hmtmcse.ocb

class ContactDetails {

    Integer id
    String mobile
    String phone
    String email
    String website
    String address
    String type
    Contact contact

    Date dateCreated
    Date lastUpdated


    static constraints = {
        mobile(nullable: true, blank: true)
        phone(nullable: true, blank: true)
        email(nullable: true, blank: true)
        website(nullable: true, blank: true)
        address(nullable: true, blank: true)
    }

    static mapping = {
        version(false)
    }
}
