var express = require('express');

var app = express.createServer();

app.get('/', function(request, response){
	response.send('welcome to Node Twitter');
});

app.listen(8000);