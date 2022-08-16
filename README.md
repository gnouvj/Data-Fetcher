# Generic Data Fetcher

## 🏆 USF Senior Team Capstone Project - Best Project - CS Night 2021. 🏆

🤝 Built in collaboration with **Josh, Geo, Ramneet** and **Mario Lim**. 🤝

---
Downloads a file given a URL to local disk, converts it into a CSV-formatted UTF-8 encoded file, and uploads it to a cloud storage service of choice. 

Currently supported file types:
1. Text File
2. Zip File
3. HTML Table
4. HTML Unordered List

Currently supported cloud storage services:
1. Google Drive
2. Amazon S3

## Starting the Application

To run this application, make sure the repository is cloned onto your local system and that the necessary packages to run the application are installed.

### Installs

The application will need the following to be installed: 

**Micronaut:** https://micronaut.io/download/

**Groovy:** https://groovy.apache.org/download.html

**Gradle:** https://gradle.org/install/

**Node:** https://nodejs.org/en/


1. Make sure that the necessary packages are installed for the front-end by running `npm install` inside ```Front-end/data-fetcher```
2. Start up the front-end by running `npm run dev`
3. Start up the back end by running `./gradlew run` in ```data-fetcher/back-end/Data-Fetcher```
4. Open up a web browser and go to http://localhost:3000/

## Viewing the Website

The website will take you to the main dashboard. The Total Success, Total Updating, and Total Error describe the total amount of jobs that were successfully converted and uploaded, are in the process of being converted and uploaded, or failed somewhere along the way. 

<img width="1678" alt="Screen Shot 2022-05-14 at 12 01 04 PM" src="https://user-images.githubusercontent.com/73259113/168445068-15d567d8-1dae-4493-bd6e-fab643945804.png">

The "Notifications" box describes the status of recent configurations. The recent jobs tab shows the most recent job forms that were submitted. 

To begin the process create a new job by clicking on **Add Job** or going to http://localhost:8080/newConfig

It will take you to the page that allows you to fill in form components. 

<img width="1679" alt="Screen Shot 2022-05-14 at 12 03 21 PM" src="https://user-images.githubusercontent.com/73259113/168445155-15ea0e0b-971d-4fec-938c-690ee2a703ab.png">

The form will now need to be filled out. 

1. **Job Name**: 
This is the name of the job. This is also the name of your file that will be uploaded to the cloud storage system of choice.

1. **Description**: 
This is the description of your job for quick reference of what job was sent. 

1. **File Type**: 
The file type is a drop down menu of what file types are currently supported for conversion (currently zip and text files, HTML tables, and HTML Unordered lists). Select the file that you plan on having downloaded and converted and click on "New Fetching Information" on the bottom right to fill in the required information about the file you want processed. 

All file types will require the URL to the file, the headers of the columns (if not already provided), and the path of the location you want the files to be saved locally. You will also need to know the information about the file ahead of time, so some files may need to be downloaded and looked through in order to gather their information (such as the delimiter of a file, its headers, etc).

If headers are filled out, they should be separated entered one at a time and separated by commas. For example: ```[these, are, headers]```

---

# Specific Files Requirements 
### Zip Files & Text Files

1. **File Name** (Zip Files only): Enter the name of the file you want to be processed.
2. **Delimiter**: This is going to be the delimiter of the file. For example, "\t" for tab delimiter. 

### HTML Table

1. **Table Index**: Enter the index of the HTML table you want parsed. Index will start at 0 to represent the 1st table on a page, and so forth. 

### HTML Unordered List

1. **Selector**: Find the selector of your list by looking at the page source and finding where the list begins.  
![Screen Shot 2022-05-04 at 7 51 35 PM](https://user-images.githubusercontent.com/73259113/166857298-d3cc8ea6-039a-4784-ac6e-b5fc07aeda97.png)

For example, this list starts at the element that contains "accounting" under the `div class="column"` tag.  
This makes the selector `div.column`.

2. **List Index**: Enter the indexes of the tables you want parsed separated by comma. For example 0, 1. 

---
# Storage Information

### Amazon S3

1. Amazon S3 is a storage option that the user can choose to store the processed .csv file in. 
2. The application will need several pieces of information from the user.
  - Secret Key
  - Access Key
  - Bucket Name
  - Region (this is the region that the bucket is assigned to)
  - Path to Folder (this is the path to a folder that the user would like to place their file in S3)
  
  For example: drive/test (in this example, the file would be put in a folder called "drive" with a subfolder called "test"
  User can either choose to create a new folder or access one that is already in the bucket.

Screenshot of form input for reference:

<img width="716" alt="Screen Shot 2022-05-14 at 12 00 36 PM" src="https://user-images.githubusercontent.com/73259113/168445199-cbda88ce-304c-486b-a74e-6c1e0ee65a9d.png">

### Google Drive

1. Google Drive is the alternate storage option that the user can choose to store the processed .csv file in.
  - The user is expected to have a Google Drive account created before using this as a possible option. When authenticating to Google Drive, the user will 
  - be asked to login to their specifed Google account.

2. The application will only need to know the following:
  - Folder Name (The name of the folder that the file will be saved into)
 
