package com.datafetcher.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import jakarta.inject.Inject
import com.datafetcher.service.ZipFileRequirements

/** ZipFileController acts as middleman for dynamic form to happen (information stored in Zip File Requirement's object)*/
@Controller("/zipFiles")
class ZipFileController {
    /** Objects that hold the requirement for fetching a site with a zip file. */
    @Inject
    ZipFileRequirements zipFileRequirement;

    /** Returns zip file's specific requirements */
    @Get(produces = MediaType.APPLICATION_JSON)
    String sendData() {
        return zipFileRequirement.getFileRequirementsJson();
    }
}
