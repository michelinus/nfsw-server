# Need For Speed World Server

Fork based on soapbox-race by nilzao (https://github.com/nilzao/soapbox-race).

# HOW-TO: Compile Source: 
- Download Eclipse JavaEE.
- Download eGit Maven SCM profile from the Eclipse marketplace. 
- Import project from the SCM profile .
- Build the server with the built-in maven using `clean compile assembly:single`.

# HOW-TO: Run the server:

- mysql db server running
- openfire xmpp server running (try openfire/README.md file)
- edit nfsw.cfg file 
    
example:

    java -jar server.jar

# HOW-TO: Login:

- Users + Password hashes(SHA-1) (default MySQL entries):

```
format:
email            passwordHash (SHA-1)
debug@player1    a94a8fe5ccb19ba61c4c0873d391e987982fbbd3
debug@player2    a94a8fe5ccb19ba61c4c0873d391e987982fbbd3
debug@player3    a94a8fe5ccb19ba61c4c0873d391e987982fbbd3
```

# HOW-TO: Get loginToken and userID:

`http://ip-to-http-host:1337/nfsw/Engine.svc/user/authenticateUser?email=EMAIL&password=SHA1_PASSWORD`

example:

    http://localhost:1337/nfsw/Engine.svc/user/authenticateUser?email=debug@player1&password=a94a8fe5ccb19ba61c4c0873d391e987982fbbd3

# HOW-TO: Launch Need For Speed World:

- create a link to nfsw.exe and edit it like this:

`\path\to\nfsw.exe ANYTHING_YOU_WANT http://ip-to-http-host:1337/nfsw/Engine.svc loginToken userId`

example:

`\path\to\nfsw.exe US http://localhost:1337/nfsw/Engine.svc 3484061174147 3`

# HOW-TO: Create users

- Create user

`http://ip-to-http-host:1337/nfsw/Engine.svc/user/createUser?email=SOME_EMAIL&password=SOME_HASH_PASSWORD`

example

`http://localhost:1337/nfsw/Engine.svc/user/createUser?email=myuser@somewhere&password=a94a8fe5ccb19ba61c4c0873d391e987982fbbd3`