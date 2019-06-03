#To access a token
http://localhost:8080/oauth/token
#Authorization:
	type: Basic Auth
	Username: moke-client
	Password: moke-secret
#Body: use application/x-www-form-urlencoded
	username: Alex123
	password: password
	grant_type: password

#To access the resource
http://localhost:8080/users/user
#Header
	Authorization: the returned generated token
