# springboot3-cloud-gateway-keyclock
Integration of Spring Cloud Gateway with Keylock with Openid Connect protocol


1- Run Keyclock

$> cd $KEYCLOCK_HOME/bin
$> kc.sh start


2- Create Realm in keyclock : go to http://localhost:8080

![image](https://user-images.githubusercontent.com/1805479/224290082-9e5fcfb4-5748-4a49-b06e-afd7b62b3615.png)

3 - Select created Realm

4- Create Client 

![image](https://user-images.githubusercontent.com/1805479/224293467-ae12762d-01b0-4a5c-a96d-c823ae79e82c.png)

5- Get the client secret

![image](https://user-images.githubusercontent.com/1805479/224293618-e8a3b803-e16e-4f67-b6be-87e126fd3cc0.png)


6 - Create user with password
![image](https://user-images.githubusercontent.com/1805479/224290575-192e43bc-07ab-4f0a-b656-6d057b4a2567.png)

7 - Run Spring cloud Gateway

You should configure in the application.yml file the client id and client secret created in keyclock

8 - Run Product Service

9- Call product service API behind Gateway: http://localhost:9090/product/

10- User should be redirect to keyclock login page: 

![image](https://user-images.githubusercontent.com/1805479/224292736-2aa881dc-a4fc-4d8f-a689-8dfdcb49aeaf.png)

10 - After login phase, user will be redirect to product service behing gateway:

![image](https://user-images.githubusercontent.com/1805479/224292985-e5fa1556-e8a8-45f4-b716-9210c57a7cd4.png)



