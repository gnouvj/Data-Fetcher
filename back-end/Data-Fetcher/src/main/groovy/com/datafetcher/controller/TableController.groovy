package com.datafetcher.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import jakarta.inject.Inject
import com.datafetcher.service.HTMLTablesRequirements

/** TableController acts as middleman for dynamic form to happen (information stored in Table Requirement's object)*/
@Controller("/htmlTables")
class TableController {
    /** Objects that hold the requirement for fetching a site with a table of data. */
    @Inject
    HTMLTablesRequirements tableRequirement;

    /** Returns table's specific requirements */
    @Get(produces = MediaType.APPLICATION_JSON)
    String sendData() {
        return tableRequirement.getFileRequirementsJson();
    }
}
