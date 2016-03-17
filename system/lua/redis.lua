local id = redis.call("INCR","userid");
if redis.call("EXISTS","name") == 1 then
	return false;
end
if redis.call("GET", "110422") == "0" then
	return false;
end
if redis.call("DECR", "110422") <= 0 then
	return false;
end
redis.call("SET", id, "1");
redis.call("EXPIRE", id, "300");