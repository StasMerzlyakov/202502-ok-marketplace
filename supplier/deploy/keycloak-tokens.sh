#!/bin/bash

KCHOST=http://localhost:8080
REALM=supplier
CLIENT_ID=supplier-service
UNAME=supplier-test
PASSWORD=supplier

# shellcheck disable=SC2006
#ACCESS_TOKEN=`curl \
#  -d "client_id=$CLIENT_ID" -d "client_secret=$CLIENT_SECRET" \
#  -d "username=$UNAME" -d "password=$PASSWORD" \
#  -d "grant_type=password" \
#  "$KCHOST/auth/realms/$REALM/protocol/openid-connect/token"  | jq -r '.access_token'`

ACCESS_TOKEN=`curl \
  -d "client_id=$CLIENT_ID" \
  -d "username=$UNAME" \
  -d "password=$PASSWORD" \
  -d "grant_type=password" \
  "$KCHOST/realms/$REALM/protocol/openid-connect/token"  | jq -r '.access_token'`
echo "$ACCESS_TOKEN"

#curl \
#  -d "client_id=$CLIENT_ID" \
#  -d "username=$UNAME" \
#  -d "password=$PASSWORD" \
#  -d "grant_type=password" \
#  "$KCHOST/realms/$REALM/protocol/openid-connect/token" 


