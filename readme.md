# sec-java-agent

This repository is for testing and finding security vulnerabilities in a Spring web app using Code QL, and then using Github Code Agent to fix these issues.

The first step is to create a form that is submitted to the backend without any validation in the HTML or backend.
- Can Code QL find this issue?
- Can Github Code Agent fix this issue?

Tasks:

- [x] Install Java and Maven
- [x] Set up a Spring web app with Spring Boot
- [x] Create a page with a form without validation in the HTML
- [x] Add a handler for this form
- [x] Print the contents from the form
- [x] Upload the code to GitHub
- [ ] Set up Code QL in the repository
- [ ] Find security issues
- [ ] Set up Github Code Agent