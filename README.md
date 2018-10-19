When i boot the app, both api endpoints work just fine:

http://localhost:8090/api/placement/ => 200 works fine

http://localhost:8090/api/placementType => 200 works fine

But after i visit PlacementType from Placement (`@ManyToOne`)  i can't access PlacementType endpoint:

http://localhost:8090/api/placement/1/type => 200 works fine

http://localhost:8090/api/placementType => 404
```
 GET  http://localhost:8090/api/placementType 200
 02:44:56.197 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Bound request context to thread: org.apache.catalina.connector.RequestFacade@5d505375
 02:44:56.197 [http-ni] DEBUG o.s.w.s.DispatcherServlet                - DispatcherServlet with name 'dispatcherServlet' processing GET request for [/api/placementType]
 02:44:56.197 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Testing handler map [org.springframework.web.servlet.handler.SimpleUrlHandlerMapping@729cd862] in DispatcherServlet with name 'dispatcherServlet'
 02:44:56.197 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Testing handler map [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping@1ccdc7aa] in DispatcherServlet with name 'dispatcherServlet'
 02:44:56.197 [http-ni] DEBUG s.w.s.m.m.a.RequestMappingHandlerMapping - Looking up handler method for path /api/placementType
 02:44:56.197 [http-ni] DEBUG s.w.s.m.m.a.RequestMappingHandlerMapping - Did not find handler method for [/api/placementType]
 02:44:56.197 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Testing handler map [org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping@6e239337] in DispatcherServlet with name 'dispatcherServlet'
 02:44:56.197 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Testing handler map [org.springframework.data.rest.webmvc.support.DelegatingHandlerMapping@320ff86f] in DispatcherServlet with name 'dispatcherServlet'
 02:44:56.211 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Testing handler adapter [org.springframework.data.rest.webmvc.RepositoryRestHandlerAdapter@42cc5460]
 02:44:56.211 [http-ni] DEBUG o.s.w.s.DispatcherServlet                - Last-Modified value for [/api/placementType] is: -1
 Hibernate: select placementt0_.id as id1_2_, placementt0_.name as name2_2_ from placement_type placementt0_ limit ?
02:44:56.223 [http-ni] DEBUG m.m.a.RequestResponseBodyMethodProcessor - Written [PagedResource { content: [Resource { content: com.varren.model.PlacementType@9bcf44c, links: [<http://localhost:8090/api/placementType/1>;rel="self", <http://localhost:8090/api/placementType/1>;rel="placementType"] }], metadata: Metadata { number: 0, total pages: 1, total elements: 1, size: 20 }, links: [<http://localhost:8090/api/placementType{?page,size,sort}>;rel="self", <http://localhost:8090/api/profile/placementType>;rel="profile"] }] as "application/hal+json" using [org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration$ResourceSupportHttpMessageConverter@559d19c]
 02:44:56.223 [http-ni] DEBUG o.s.w.s.DispatcherServlet                - Null ModelAndView returned to DispatcherServlet with name 'dispatcherServlet': assuming HandlerAdapter completed request handling
 02:44:56.224 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Cleared thread-bound request context: org.apache.catalina.connector.RequestFacade@5d505375
 02:44:56.224 [http-ni] DEBUG o.s.w.s.DispatcherServlet                - Successfully completed request

 GET http://localhost:8090/api/placement/1/type 200
 02:47:03.833 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Bound request context to thread: org.apache.catalina.connector.RequestFacade@5d505375
 02:47:03.833 [http-ni] DEBUG o.s.w.s.DispatcherServlet                - DispatcherServlet with name 'dispatcherServlet' processing GET request for [/api/placement/1/type]
 02:47:03.833 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Testing handler map [org.springframework.web.servlet.handler.SimpleUrlHandlerMapping@729cd862] in DispatcherServlet with name 'dispatcherServlet'
 02:47:03.834 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Testing handler map [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping@1ccdc7aa] in DispatcherServlet with name 'dispatcherServlet'
 02:47:03.835 [http-ni] DEBUG s.w.s.m.m.a.RequestMappingHandlerMapping - Looking up handler method for path /api/placement/1/type
 02:47:03.836 [http-ni] DEBUG s.w.s.m.m.a.RequestMappingHandlerMapping - Did not find handler method for [/api/placement/1/type]
 02:47:03.836 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Testing handler map [org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping@6e239337] in DispatcherServlet with name 'dispatcherServlet'
 02:47:03.836 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Testing handler map [org.springframework.data.rest.webmvc.support.DelegatingHandlerMapping@320ff86f] in DispatcherServlet with name 'dispatcherServlet'
 02:47:03.841 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Testing handler adapter [org.springframework.data.rest.webmvc.RepositoryRestHandlerAdapter@42cc5460]
 02:47:03.841 [http-ni] DEBUG o.s.w.s.DispatcherServlet                - Last-Modified value for [/api/placement/1/type] is: -1
 Hibernate: select placement0_.id as id1_0_0_, placement0_.name as name2_0_0_, placement0_.theme_id as theme_id3_0_0_, placement0_.type_id as type_id4_0_0_ from placement placement0_ where placement0_.id=?
Hibernate: select placementt0_.id as id1_2_0_, placementt0_.name as name2_2_0_ from placement_type placementt0_ where placementt0_.id=?
02:47:03.889 [http-ni] DEBUG o.s.w.s.m.m.a.HttpEntityMethodProcessor  - Written [Resource { content: com.varren.model.PlacementType@68aabbdb, links: [<http://localhost:8090/api/placementType/1>;rel="self", <http://localhost:8090/api/placementType/1>;rel="placementType"] }] as "application/hal+json" using [org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration$ResourceSupportHttpMessageConverter@559d19c]
 02:47:03.890 [http-ni] DEBUG o.s.w.s.DispatcherServlet                - Null ModelAndView returned to DispatcherServlet with name 'dispatcherServlet': assuming HandlerAdapter completed request handling
 02:47:03.890 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Cleared thread-bound request context: org.apache.catalina.connector.RequestFacade@5d505375
 02:47:03.890 [http-ni] DEBUG o.s.w.s.DispatcherServlet                - Successfully completed request

 GET http://localhost:8090/api/placementType 404
 02:43:16.515 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Bound request context to thread: org.apache.catalina.connector.RequestFacade@748ff89b
 02:43:16.515 [http-ni] DEBUG o.s.w.s.DispatcherServlet                - DispatcherServlet with name 'dispatcherServlet' processing GET request for [/api/placementType]
 02:43:16.515 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Testing handler map [org.springframework.web.servlet.handler.SimpleUrlHandlerMapping@632241f5] in DispatcherServlet with name 'dispatcherServlet'
 02:43:16.515 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Testing handler map [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping@45d7495e] in DispatcherServlet with name 'dispatcherServlet'
 02:43:16.515 [http-ni] DEBUG s.w.s.m.m.a.RequestMappingHandlerMapping - Looking up handler method for path /api/placementType
 02:43:16.516 [http-ni] DEBUG s.w.s.m.m.a.RequestMappingHandlerMapping - Did not find handler method for [/api/placementType]
 02:43:16.516 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Testing handler map [org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping@721fc2e3] in DispatcherServlet with name 'dispatcherServlet'
 02:43:16.516 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Testing handler map [org.springframework.data.rest.webmvc.support.DelegatingHandlerMapping@55fb36de] in DispatcherServlet with name 'dispatcherServlet'
 02:43:16.518 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Testing handler map [org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport$EmptyHandlerMapping@3df77dfa] in DispatcherServlet with name 'dispatcherServlet'
 02:43:16.518 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Testing handler map [org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport$EmptyHandlerMapping@63187d63] in DispatcherServlet with name 'dispatcherServlet'
 02:43:16.518 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Testing handler map [org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport$EmptyHandlerMapping@1ccdc7aa] in DispatcherServlet with name 'dispatcherServlet'
 02:43:16.518 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Testing handler map [org.springframework.boot.autoconfigure.web.servlet.WelcomePageHandlerMapping@12f9f896] in DispatcherServlet with name 'dispatcherServlet'
 02:43:16.519 [http-ni] WARN  o.s.w.s.PageNotFound                     - No mapping found for HTTP request with URI [/api/placementType] in DispatcherServlet with name 'dispatcherServlet'
 02:43:16.519 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Cleared thread-bound request context: org.apache.catalina.connector.RequestFacade@748ff89b
 02:43:16.519 [http-ni] DEBUG o.s.w.s.DispatcherServlet                - Successfully completed request
 02:43:16.519 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Bound request context to thread: org.apache.catalina.core.ApplicationHttpRequest@6750ee77
 02:43:16.519 [http-ni] DEBUG o.s.w.s.DispatcherServlet                - DispatcherServlet with name 'dispatcherServlet' processing GET request for [/error]
 02:43:16.519 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Testing handler map [org.springframework.web.servlet.handler.SimpleUrlHandlerMapping@632241f5] in DispatcherServlet with name 'dispatcherServlet'
 02:43:16.519 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Testing handler map [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping@45d7495e] in DispatcherServlet with name 'dispatcherServlet'
 02:43:16.519 [http-ni] DEBUG s.w.s.m.m.a.RequestMappingHandlerMapping - Looking up handler method for path /error
 02:43:16.520 [http-ni] DEBUG s.w.s.m.m.a.RequestMappingHandlerMapping - Returning handler method [public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)]
 02:43:16.521 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Testing handler adapter [org.springframework.data.rest.webmvc.RepositoryRestHandlerAdapter@278fe428]
 02:43:16.521 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Testing handler adapter [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter@6d0114c0]
 02:43:16.522 [http-ni] DEBUG o.s.w.s.DispatcherServlet                - Last-Modified value for [/error] is: -1
 02:43:16.523 [http-ni] DEBUG o.s.w.s.v.ContentNegotiatingViewResolver - Requested media types are [text/html, text/html;q=0.8] based on Accept header types and producible media types [text/html])
 02:43:16.525 [http-ni] DEBUG o.s.w.s.v.ContentNegotiatingViewResolver - Returning [org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$SpelView@34fcd292] based on requested media type 'text/html'
 02:43:16.525 [http-ni] DEBUG o.s.w.s.DispatcherServlet                - Rendering view [org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$SpelView@34fcd292] in DispatcherServlet with name 'dispatcherServlet'
 02:43:16.525 [http-ni] TRACE o.s.w.s.DispatcherServlet                - Cleared thread-bound request context: org.apache.catalina.core.ApplicationHttpRequest@6750ee77
 02:43:16.525 [http-ni] DEBUG o.s.w.s.DispatcherServlet                - Successfully completed request
```