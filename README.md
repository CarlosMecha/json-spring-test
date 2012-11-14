JSON Test

==============================

A simple (and incomplete) JSON webapp. It uses Spring MVC 3 + REST and the Jackson JSON Library. There are just two URLs mapped:

- / : The home, you can create a new bean, sent by a POST&Ajax method. The result will be showed on the web, but also, you can check the Tomcat logs. 
- /json/{id}/{name} : Creates a new JSON bean.

==============================

Requirements:

- Tomcat 6
- Maven 2+ 
- 'tomcat-localhost' server credentials in maven settings.xml