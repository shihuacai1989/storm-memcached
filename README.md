# storm-memcached
This library implements a Trident state on top of Memcached. It supports non-transactional, transactional, and opaque state types.

代码根据https://github.com/nathanmarz/trident-memcached 修改而来，主要将memcached的java客户端由twitter调整为了spymemcached,Maven引入为：

&lt;dependency&gt;<br/>
&nbsp;&nbsp;  &lt;groupId&gt;net.spy&lt;/groupId&gt;<br/>
&nbsp;&nbsp;  &lt;artifactId&gt;spymemcached&lt;/artifactId&gt;<br/>
&nbsp;&nbsp;  &lt;version&gt;2.11.7&lt;/version&gt;<br/>
&lt;/dependency&gt;

