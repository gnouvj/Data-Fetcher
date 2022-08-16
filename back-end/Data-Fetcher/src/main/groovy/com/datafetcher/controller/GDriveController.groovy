package com.datafetcher.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import jakarta.inject.Inject
import com.datafetcher.service.TextFileRequirement
import com.datafetcher.service.GDriveRequirement

/** Google Drive controller responsible for sending requirements for info needed to store using Google Drive */
@Controller("/googleDrive")
class GDriverController {
    /** Create an instance of GDriveRequirement to get its specific requirements for dynamic form. */
    @Inject
    GDriveRequirement googleDriveRequirement

    /** Returns Google Drive's specific requirements */
    @Get(produces = MediaType.APPLICATION_JSON)
    String sendData() {
        return googleDriveRequirement.getRequirements();
    }
}
