# Spring Cloud Demo

---

+ Eureka
+ RestTemplate
+ Zuul
+ Ribbon
+ Feign
+ Hystrix
+ Config
+ Zipkin

## Eureka 注册中心
- Eureka Server，注册中心
- Eureka Client，所有要进行注册的微服务通过 Eureka Client 连接到 Eureka Server，完成注册。

## RestTemplate
RestTemplate 是 Spring 框架提供的基于 REST 的服务组件。
底层是对 HTTP 请求及响应进行了封装，提供了很多访问 RETS 服务的方法，可以简化代码开发。

## Zuul 服务网关
Zuul 是 Netflix 提供的一个开源的 API 网关服务器。
是客户端和网站后端所有请求的中间层，对外开放一个 API，将所有请求导入统一的入口。
屏蔽了服务端的具体实现逻辑，Zuul 可以实现反向代理的功能。
在网关内部实现动态路由、身份认证、IP 过滤、数据监控等。

## Ribbon 负载均衡
Spring Cloud Ribbon 是一个负载均衡解决方案，Ribbon 是 Netflix 发布的负载均衡器。
Spring Cloud Ribbon 是基于 Netflix Ribbon 实现的，是一个用于对 HTTP 请求进行控制的负载均衡客户端。

## Feign
Feign 也是由 Netflix 提供的，Feign 是一个声明式、模版化的 Web Service 客户端。
它简化了开发者编写 Web 服务客户端的操作，开发者可以通过简单的接口和注解来调用 HTTP API，Spring Cloud Feign。
它整合了 Ribbon 和 Hystrix，具有可插拔、基于注解、负载均衡、服务熔断等一系列便捷功能。

## Hystrix 容错机制
Hystrix 数据监控需要结合 Spring Boot Actuator 来使用，Actuator 提供了对服务的健康健康、数据统计。
可以通过 hystrix.stream 节点获取监控的请求数据，提供了可视化的监控界面。

## 配置中心
Spring Cloud Config，通过服务端可以为多个客户端提供配置服务。
Spring Cloud Config 可以将配置文件存储在本地，也可以将配置文件存储在远程 Git 仓库。
创建 Config Server，通过它管理所有的配置文件。

## Zipkin 服务追踪
Zipkin 是一个可以采集并且跟踪分布式系统中请求数据的组件，让开发者可以更加直观的监控到请求在各个微服务所耗费的时间等。
Zipkin：Zipkin Server、Zipkin Client。