# Online Event Planner

This is a web-based event planning application that allows administrators, vendors, and users to manage and plan events. The system is built using Java for the backend and HTML/CSS for the frontend.

## Table of Contents
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [Functionality](#functionality)


## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) installed.
- A web server for hosting the frontend (e.g., Apache Tomcat).
- A relational database system (e.g., MySQL) for storing data.

## Installation

1. Clone the repository to your local machine:

   git clone https://github.com/yourusername/online-event-planner.git

Set up your web server to host the frontend files (HTML/CSS).

Create a database and configure its connection in the backend Java application

##Configuration
- Backend Configuration
Open the backend Java project in your preferred Integrated Development Environment (IDE).

Configure the database connection details in application.properties or a similar configuration file.

Make sure all the necessary Java libraries and dependencies are resolved.

- Frontend Configuration
In the frontend directory, update any API endpoint URLs to match your backend server's address.

Customize the HTML and CSS files to match your project's branding and design.

##Usage

1.Start your web server to host the frontend.

2.Deploy and run the backend Java application on your server.

3.Access the application through a web browser using the URL provided by your web server.

##Functionality

Admin Features:

Admin can log in using their credentials.
Admin can add vendors to the system.
Admin can view vendor details.
Admin can view user registrations and activate/deactivate them.
Vendor Features:

Vendor can log in using their credentials.
Vendor can add event packages.
Vendor can view user plan requests and create quotations.
User Features:

User can log in using their credentials.
User can view their profile and edit details.
User can change their password.
User can send plan requests to vendors.
User can view quotations and accept/reject them.



