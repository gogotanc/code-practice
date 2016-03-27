function route(handle, pathname){
	console.log('About to route a request for ' + pathname);
	if (typeof handle[pathname] === 'function') {
		handle[pathname]();
	} else {
		console.log('No such request handler for this url');
	}
}
exports.route = route;