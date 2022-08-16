package com.datafetcher.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import jakarta.inject.Inject
import com.datafetcher.service.TextFileRequirement
import com.datafetcher.service.AmazonRequirement

/** Amazon controller responsible for sending requirements for info needed to store using Amazon*/
@Controller("/amazon")
class AmazonController {
    /** Create an instance of amazonRequirement to get its specific requirements for dynamic form. */
    @Inject
    AmazonRequirement amazonRequirement

    /** Returns Amazon's specific requirements */
    @Get(produces = MediaType.APPLICATION_JSON)
    String sendData() {
        return amazonRequirement.getRequirements();
    }
}
