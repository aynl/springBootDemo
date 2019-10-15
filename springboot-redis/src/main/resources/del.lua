local result = 0

local hashKey = KEYS[1];
local hashField = KEYS[2];

result = redis.call('HDEL', hashKey, hashField)

return result