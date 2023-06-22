package test;

import redis.clients.jedis.Jedis;

public class JedisExample {
	public static void main(String[] args) throws Exception {
	    Jedis jedis = new Jedis("127.0.0.1", 6379);
//	    jedis.auth("password");
	    System.out.println("Connected to Redis");
	  }
}S
