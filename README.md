# storm-memcached
This library implements a Trident state on top of Memcached. It supports non-transactional, transactional, and opaque state types.

代码根据https://github.com/nathanmarz/trident-memcached/修改而来，主要将memcached的java客户端由twitter调整为了spymemcached
<dependency>
  <groupId>net.spy</groupId>
  <artifactId>spymemcached</artifactId>
  <version>2.11.7</version>
</dependency>

