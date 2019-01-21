# springcloud_zookeeper
使用Zookeeper作为注册中心的项目演练，
两个SpringCloud项目;订单服务、会员服务（订单服务调用会员服务）;
很重要一点：项目中的Zookeeper Client版本和Zookeeper Server版本必须一致；否则可能发生注册失败或项目启动问题; 
#用到的技术： 
restTemeplate RPC调用;  
Zookeeper作为注册中心; 
@LoadBalanced基于Netflix Ribbon实现的一套客户端负载均衡的工具 
Maven
