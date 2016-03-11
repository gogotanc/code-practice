if redis.call("EXIST","name") == 1 then
	return false;
end
if redis.call("GET", "110422") == "0" then
	return false;
end
if redis.call("DECR", "110422") <= 0 then
	return false;
end
redis.call("SET", "name", "1");
redis.call("EXPIRE", "name", "30");