# Group6_CST438_Project03_Web
## Team Members

1. Alfredo Hernandez
2. Jose Barroso A.
3. Rakery Cheng
4. Ryan Trinh

## App Description
This is a web based "story time" application using modern web frameworks. This will require the development of a Representational state transfer (REST) Application Programming Interface (API), a constant integration, constant development (CICD) pipeline, and a persistence (Database) layer. The website will be deployed to a Platform as a Service (PaaS) such as Heroku or Google App Engine, and will also have a mobile front-end (android) 
- [Link to Mobile Front-end Repo](https://github.com/rakcheng/Group6_CST438_Project03_Android)
- [Link to Back-end Repo](https://github.com/ahernandez1215/Group6_CST438_Project3_backend/tree/master)


## Resources 
- [Using OAuth 2.0 to Access Google APIs ](https://developers.google.com/identity/protocols/oauth2)
- [Spring Boot CRUD operations](https://www.geeksforgeeks.org/spring-boot-crud-operations-using-mysql-database/)
- [How to interact with REST APIs from JavaScript](https://blog.teclado.com/how-to-interact-with-rest-apis-from-javascript/)
- [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
- [Generating Code Snippets on Postman API](https://learning.postman.com/docs/sending-requests/generate-code-snippets/)

## Entity Relationship Diagram(s)
![image](https://user-images.githubusercontent.com/10646650/162261351-ffe7e6cf-ac44-474d-812a-5f8ad5578b7c.png)

## API Endpoints
**List all Items**
- GET [URL]/items

**Show a specific list/story**
- GET [URL]/items?list={list name || list ID}

**Add a new post to a story**
- POST [URL]/items?item_name={item name}&url={url}

**Delete a story post**
- DELETE [URL]/items?item_name={item id}

**Create new User Account**
- POST:[url]/newuser?username={username}&password={password}

**Update Story Item**
- PATCH [URL]/items?item_name={item id}

**Delete Account (Must ask for Confirmation)**
- DELETE: [URL]/users?username={username}

**Show a Specific Story**
- GET [URL]/items?list={list name || list ID}

**Logout of Account**
- POST/GET [url]/logout?username={username}

**Login to Account**
- POST:[url]/login?username={username}&password={password}
## Site Map (Files)
1. index.html (landing page)
2. about.html (login page)

**User Auth Pages (Must be logged in to see)**

3. profile.html (log-in w/ Google OAuth2.0)

## Site Map 
- We are thinking of condensing the web front-end to three HTML files that represent index page, about page, and a profile page (once user is logged in).
- Landing Page
<img src="https://user-images.githubusercontent.com/10646650/165412399-c99afafa-c354-4366-af7c-89c06aaf1097.png" width="600">

- Profile Page
<img src="https://user-images.githubusercontent.com/10646650/165412418-8129df3b-d26c-4353-81bc-62eb75008a54.png" width="600">

- About Page
<img src="https://user-images.githubusercontent.com/10646650/165412456-0a23449c-44a9-4bca-a892-e3001fdd9695.png" width="600">



