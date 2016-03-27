var http = require('http');
var url = require('url');

function start(route, handle){
	function onRequest(request, response){
		var httpUrl = url.parse(request.url).pathname;
		route(handle, httpUrl);
		response.writeHead(200, {'Content-Type': 'text/plain'});
		response.write("hello nodejs\n");
		response.end();
	}
	http.createServer(onRequest).listen(8888);
	console.log('服务启动成功。');
}
exports.start = start;