var http = require('http');

function start(){
	function onRequest(request, response){
		response.writeHead(200, {'Content-Type': 'text/plain'});
		response.write("hello nodejs\n");
		response.end();
	}
	http.createServer(onRequest).listen(8888);
}
exports.start = start;