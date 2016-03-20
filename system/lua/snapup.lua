-- 用户抢购的脚本
if redis.call("EXISTS","goodsid") == 0 then
	return false;
end
if redis.call("GET","goodsid") == '0' then
	return false;
end
if redis.call('DECR', 'goodsid') < 0 then
	return false;
else
	return true;
end