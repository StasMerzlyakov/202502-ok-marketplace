#!/bin/bash

KCHOST=http://localhost:8080
REALM=meethere
CLIENT_ID=meethere-service
UNAME=user
PASSWORD=123456


#curl \
#  -d "client_id=$CLIENT_ID" \
#  -d "username=$UNAME" \
#  -d "password=$PASSWORD" \
#  -d "grant_type=password" \
#  "$KCHOST/realms/$REALM/protocol/openid-connect/token"
#exit

ACCESS_TOKEN=`curl \
  -d "client_id=$CLIENT_ID" \
  -d "username=$UNAME" \
  -d "password=$PASSWORD" \
  -d "grant_type=password" \
  "$KCHOST/realms/$REALM/protocol/openid-connect/token" | jq -r '.access_token'` 
echo "$ACCESS_TOKEN"

#curl \
#  -d "client_id=$CLIENT_ID" \
#  -d "username=$UNAME" \
#  -d "password=$PASSWORD" \
#  -d "grant_type=password" \
#  "$KCHOST/realms/$REALM/protocol/openid-connect/token" 


