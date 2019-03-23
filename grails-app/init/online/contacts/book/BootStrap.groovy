package online.contacts.book

import com.hmtmcse.ocb.AppInitializationService

class BootStrap {

    def init = { servletContext ->
        AppInitializationService.initialize()
    }

    def destroy = {
    }
}
