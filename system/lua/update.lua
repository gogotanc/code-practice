if redis.call('GET','goodsid') ~= 'count' then
	return;
end
redis.call('SET', '');