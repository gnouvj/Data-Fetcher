package com.datafetcher.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import jakarta.inject.Inject
import com.datafetcher.service.HTMLListsRequirement

/** List Controller acts as middleman for dynamic form to happen (information stored in List Requirement's object)*/
@Controller("/htmlLists")
class ListController {
    /** Objects that hold the requirement for fetching a site with list of data. */
    @Inject
    HTMLListsRequirement listRequirement;

    /** Returns List's specific requirements */
    @Get(produces = MediaType.APPLICATION_JSON)
    String sendData() {
        return listRequirement.getFileRequirementsJson();
    }
}
