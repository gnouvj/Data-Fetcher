package com.datafetcher.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import jakarta.inject.Inject
import com.datafetcher.service.TextFileRequirement

/** TextFileController acts as middleman for dynamic form to happen (information stored in Text File Requirement's object)*/
@Controller("/textFiles")
class TextFileController {
    /** Objects that hold the requirement for fetching a site with a simple text file. */
    @Inject
    TextFileRequirement textFileRequirement;

    /** Returns text file's specific requirements */
    @Get(produces = MediaType.APPLICATION_JSON)
    String sendData() {
        return textFileRequirement.getFileRequirementsJson();
    }
}
