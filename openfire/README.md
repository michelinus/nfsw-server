# Using openfire 4.0.3

- install openfire


# Windows:

- place openfired.vmoptions file inside openfire bin folder.

# Linux:

- edit /opt/openfire/bin/openfire file, put:

    INSTALL4J_ADD_VM_PARAMS=" -Djsse.enableCBCProtection=false"

---

# Remove mechanisms tag:

need to remove tag <mechanisms xmlns="urn:ietf:params:xml:ns:xmpp-sasl"> to work with soapbox.exe

- rename the file  SASLAuthentication.classx to  SASLAuthentication.class
- go inside openfire.jar (with Winrar for example)
- replace the org/jivesoftware/openfire/net/SASLAuthentication.class file

---

# Change xmpp.domain

go to url:

    http://localhost:9090/server-properties.jsp

- find xmpp.domain
- set xmpp.domain to your ip
- Save

---

# Install restApi plugin

go to url:

    http://localhost:9090/available-plugins.jsp

find and add REST API plugin

go to url:

    http://localhost:9090/plugins/restapi/rest-api.jsp

- set Enabled
- set Secret key auth - REST API authentication over specified secret key
- copy the Secret key (need it later to start server)
- Save Settings

---

# Disable compression

go to url:

    http://localhost:9090/compression-settings.jsp

- Disable
- Save

---

# Disable register

go to url:

    http://localhost:9090/reg-settings.jsp
    
- Disable
- Save
 
---

# Disable disconnect idle client

go to url 

    http://localhost:9090/connection-settings-socket-c2s.jsp

- Do not disconnect clients that are idle.
- Do not send XMPP Ping requests to idle clients.
