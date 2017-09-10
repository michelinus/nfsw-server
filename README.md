# NFSW-Server

Project based on soapbox-race

#HOW-TO: Run the server:

- mysql db server running
- openfire xmpp server running (try openfire/README.md file)
- edit soapbox.properties file 
    
example:

    java -jar server.jar

##How to login

- Users + Password hashes(SHA-1) (default MySQL entries):

```
format:
email            passwordHash
debug@player1    a94a8fe5ccb19ba61c4c0873d391e987982fbbd3
debug@player2    a94a8fe5ccb19ba61c4c0873d391e987982fbbd3
debug@player3    a94a8fe5ccb19ba61c4c0873d391e987982fbbd3
```

- Get loginToken and userID with:

`http://ip-to-http-host:1337/nfsw/Engine.svc/user/authenticateUser?email=SOME_EMAIL&password=SOME_HASH_PASSWORD`

examples:

    http://localhost:1337/nfsw/Engine.svc/user/authenticateUser?email=debug@player1&password=a94a8fe5ccb19ba61c4c0873d391e987982fbbd3
    http://localhost:1337/nfsw/Engine.svc/user/authenticateUser?email=debug@player2&password=a94a8fe5ccb19ba61c4c0873d391e987982fbbd3
    http://localhost:1337/nfsw/Engine.svc/user/authenticateUser?email=debug@player3&password=a94a8fe5ccb19ba61c4c0873d391e987982fbbd3


- Launch Need For Speed World with the parameters: 

`nfsw.exe ANYTHING_YOU_WANT http://ip-to-http-host:1337/nfsw/Engine.svc loginToken userId`

example:

`nfsw.exe US http://localhost:1337/nfsw/Engine.svc 3484061174147 3`

##How to create users

- Create user

`http://ip-to-http-host:1337/nfsw/Engine.svc/user/createUser?email=SOME_EMAIL&password=SOME_HASH_PASSWORD`

example

`http://localhost:1337/nfsw/Engine.svc/user/createUser?email=myuser@somewhere&password=a94a8fe5ccb19ba61c4c0873d391e987982fbbd3`