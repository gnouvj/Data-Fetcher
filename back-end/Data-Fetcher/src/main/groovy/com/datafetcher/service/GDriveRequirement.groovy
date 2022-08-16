package com.datafetcher.service

import com.datafetcher.service.Requirements
import jakarta.inject.Singleton;

@Singleton
class GDriveRequirement extends Requirements {

    // Nothing to return since it's for Amazon storage specifically
    Map fileTypeProperties() {
        return [:]
    }
    
    /**
    Requirements for this specific type of file.
    */
    public Map storageProperties() {
        return [folder_name:'text']
    }
}
