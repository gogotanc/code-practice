var net = require('net');

var chatServer = net.createServer(),
	clientList = [];

chatServer.on('connection', function(client){
	var clientName = client.remoteAddress + ':' + client.remotePort;
	client.write('Hi,' + clientName + '\n');
	clientList.push(client);
	client.on('data', function(data){
		broadcast(data, client)
	});
	client.on('end', function(){
		clientList.splice(clientList.indexOf(client), 1);
	});
	// client.end();
});

function broadcast(message, client){
	for (var i=0; i<clientList.length; i++) {
		if(client !== clientList[i]) {
			clientList[i].write(message);
		}
	}
}

chatServer.listen(9000);