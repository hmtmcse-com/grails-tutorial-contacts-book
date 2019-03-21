# Grails Tutorial For Beginner & Also for Medium.
---

**[Grails](https://www.grails.org/)**  is an open source web application **(MVC)** framework that uses the **Apache Groovy** programming language 
(which is in turn based on the Java platform). It is intended to be a high-productivity framework by following the **coding by convention** 
paradigm, providing a stand-alone development environment and hiding much of the configuration detail from the developer. 


<br/><br/>

## The Project Name is Online Contacts Book

#### Features
1. People can Register them self using Registrations From.
2. After Registration He/She can Login into System.
3. Can Add New Contact Group, Such as Family, Friend, Office Others
4. Can Add New Contact along with name, Image, Contact Group, and one or more Contact Details, Phone Number, Mobile Number, 
Email Address, Address etc. Contact Details Type such as Home, Office, Personal etc.
5. It will allow to search contact with Auto Suggestion.
6. A Reporting System will show, how many contact, Contact Group and Number into System.
7. There will be a default Administrator Member, Who will able to view, inActive or remove all of Regular Member
8. Please See the Last Video for Exercise.


<br/><br/>

## Let's Start

<br/><br/>

### Grails Features Overview [YouTube Link](https://www.youtube.com/channel/UCdm33qs7-m6n5Bw5gyFvuPQ)

1. **Controller**
2. **Model (Domain)**
3. **View (GSP) Groovy Server Pages**
4. **Service**
5. **TabLib**
6. **Interceptor**
7. **URLMapping**

<br/><br/>

### How to Explorer the GitHub Project [YouTube Link](https://www.youtube.com/channel/UCdm33qs7-m6n5Bw5gyFvuPQ)


<br/><br/>

### Very Basic About Environment Preparation
1. [How to setup environment, (YouTube Link)](https://www.youtube.com/watch?v=cQjgje5Gnt4)
2. [Very basic of Grails start, (YouTube Link)](https://www.youtube.com/watch?v=XRgAKhAFcwE)


<br/><br/>

### Grails Project Bismillah, (Grails Tutorial Part-1) [YouTube Link](https://www.youtube.com/watch?v=NXRwdrexEh4)
1. Clone Repository from github.com
   * Git Repository: https://github.com/hmtmcse-com/grails-tutorial-contacts-book
2. Create Online Contacts Book Grails Project
3. Configure .gitignore file
4. Push the code To GitHub
4. Run the Online Contacts Book Project

<br/><br/>

### Grails jQuery and Bootstrap Integration. (Grails Tutorial Part-2) [YouTube Link](https://www.youtube.com/watch?v=ig5qNZGbW_o)
1. Grails Asset Pipe Line,  Asset Library Plugin
2. Grails Layout and View Details
3. jQuery Integration: https://jquery.com/download/
4. Bootstrap 4 Integration: https://getbootstrap.com/
5. Create a JavaScript File & Then add Project Start Point JavaScript Object.
6. Configure Navigation and Layout With Bootstrap

<br/><br/>

### Grails CRUD Registration Form -1 (Domain), (Grails Tutorial Part-3) [YouTube Link](https://www.youtube.com/watch?v=UlOSgTsYk-4)
1. Basic About Grails Domain 
2. Create a Class named GlobalConfig and will store common configurations, such as itemsPerPage, uuid, Member Type etc.
3. Create a Domain Called Member. Fields will be
   * Integer id
   * String firstName
   * String lastName
   * String email
   * String password
   * String identityHash
   * Long identityHashLastUpdate
   * Boolean isActive
   * String memberType [Administrator, Regular Member]
4. Add constraints & beforeUpdate & beforeInsert Event, mapping fields.

<br/><br/>

### Grails CRUD Registration Form -2 (Controller, URL Mapping & Service), (Grails Tutorial Part-3) [YouTube Link](https://www.youtube.com/watch?v=0OXO7v3vtM0)
1. Basic About Grails Controller
2. Basic About Grails URL Mapping
3. Basic About Grails Service
4. Create a Class named AppUtil which will responsible for some utility function, such as response, pick session etc.
5. Create a service with below method and adding Logic there.
   * **save** : For save data into Database
   * **update** : For Update data into Database
   * **getById** : Retrieve or read data by id from Database
   * **list** : Retrieve or read all data from Database, using pagination and basic search sort mechanism
   * **delete** : Remove data from database.
6. Create a Controller With below methods
   * **index** : Landing Page and show a table with data
   * **details** : Show details of that Entity
   * **create**: Show the create form. 
   * **save**: Create form Submit action, it will save submitted data
   * **edit**: Enable edit row data with from
   * **update**: Edit form Submit action, it will update submitted data
   * **delete**: Responsible for delete data

<br/><br/>

### Grails CRUD Registration Form -3 (View, Table, Pagination, Form), (Grails Tutorial Part-3) [YouTube Link](https://www.youtube.com/channel/UCdm33qs7-m6n5Bw5gyFvuPQ)
1. Basic About Grails View
   * Grails Taglib
   * Partial Template
2. Localization i18n
3. Create a HTML form with Grails tag Lib  & Bootstrap 4 design into .gsp file
4. Debug Submission & Save Data 
5. Create Table and Show data.
6. Font Awesome Integration
7. Table Action and Pagination
8. Add Search Functionality
9. Update and Delete.

<br/><br/>

### Grails Validation and Custom Tag Library (TagLib) (Grails Tutorial Part-4) [YouTube Link](https://www.youtube.com/channel/UCdm33qs7-m6n5Bw5gyFvuPQ)
1. Validate set and parse validation message
2. Show error message using TagLib

<br/><br/>

### Grails Play with jQuery & Bootstrap 4 (Grails Tutorial Part-5) [YouTube Link](https://www.youtube.com/channel/UCdm33qs7-m6n5Bw5gyFvuPQ)
1. Show Flash Message / Notification for Create, Update, Delete
2. Confirmation Message on Delete Action.


<br/><br/>

### Grails Authentication & Authorization, Login Form (Grails Tutorial Part-6) [YouTube Link](https://www.youtube.com/channel/UCdm33qs7-m6n5Bw5gyFvuPQ)
1. Overview of Grails Interceptor 
2. Create Authentication Controller & Design Login from
3. Create and Configure Interceptor
4. Create Authentication Service & add Logic for Login Member.

<br/><br/>

### Grails Domain / Entity Relationship-1 (Grails Tutorial Part-7) [YouTube Link](https://www.youtube.com/channel/UCdm33qs7-m6n5Bw5gyFvuPQ)
1. What is Grails Entity / Domain Relationship?
2. OnToMany Relationship, Called HasMany, BelongsTo
3. ManyToMany Relationship, Called HasMany, HasMany, BelongsTo


<br/><br/>

### Grails Domain / Entity Relationship-2 HasMany, BelongsTo (Grails Tutorial Part-7) [YouTube Link](https://www.youtube.com/channel/UCdm33qs7-m6n5Bw5gyFvuPQ)
1. Create Domain called Contact. Fields will be
   * Integer id
   * String name
   * String image
   * Member member  (belongsTo Member Domain)
2. Create UI From Contact.

<br/><br/>

### Grails Domain / Entity Relationship-3 HasMany, HasMany, BelongsTo (Grails Tutorial Part-7) [YouTube Link](https://www.youtube.com/channel/UCdm33qs7-m6n5Bw5gyFvuPQ)
1. Create Domain called ContactGroup. Fields will be
   * Integer id
   * String name
   * Member member  (belongsTo Member Domain)
2. Add Belongs and HasMany to Contact Domain
3. Create UI from Contact Group



<br/><br/>

### Grails Domain / Entity Relationship-4 HasMany, BelongsTo (Grails Tutorial Part-7) [YouTube Link](https://www.youtube.com/channel/UCdm33qs7-m6n5Bw5gyFvuPQ)
1. Create Domain called ContactDetails. Fields will be
   * Integer id
   * String mobile
   * String phone
   * String email
   * String website
   * String address
   * String type
   * Contact contact  (belongsTo Contact Domain)
2. Create UI from Contact Details
3. Add jQuery Ajax Call.



<br/><br/>

### Grails Image or File Upload (Grails Tutorial Part-8) [YouTube Link](https://www.youtube.com/channel/UCdm33qs7-m6n5Bw5gyFvuPQ)
1. Create UI for Image / File Upload
2. Physical Path Determination
3. Implement into Controller & Service.



<br/><br/>

### Grails Reset Password Via Email (Grails Tutorial Part-9) [YouTube Link](https://www.youtube.com/channel/UCdm33qs7-m6n5Bw5gyFvuPQ)
1. Create UI for Reset Password
2. If email Address matched with email then sent a link to that email address.
3. Reset Password Via URL with hash code.



<br/><br/>

### Grails Change Database Configuration To MySQL (Grails Tutorial Part-10) [YouTube Link](https://www.youtube.com/channel/UCdm33qs7-m6n5Bw5gyFvuPQ)
1. Configure Database Connection for MySQL
2. Connect with MySQL server.
3. Verify the Data Storage.



<br/><br/>

### Grails Deployment Using Tomcat (Grails Tutorial Part-11) [YouTube Link](https://www.youtube.com/channel/UCdm33qs7-m6n5Bw5gyFvuPQ)
1. Create a war file.
2. Configure a tomcat.
3. Deploy The application to Tomcat Container.


<br/><br/>

### Grails Project Exercise [YouTube Link](https://www.youtube.com/channel/UCdm33qs7-m6n5Bw5gyFvuPQ)
1. Create UI for Administrator Create, Read, Update, Delete (CRUD) Panel
2. Administrator Reset Password.
3. Let me know what is your status.