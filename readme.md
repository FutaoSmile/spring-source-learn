[剑指Java自研框架，决胜Spring源码](https://coding.imooc.com/lesson/420.html)

* Java是使用java.lang.Class来描述类的信息，而Spring则是用`BeanDefinition`来描述Bean的信息
    * BeanDefinition中常用属性
        * @Scope 作用范围
        * @Lazy Bean实例是否延迟加载
        * @Primary  是否是优先的实现类(一个接口有多个实现类Bean，则优先使用@Primary标注的那个Bean)
      
* 容器启动与Bean的加载过程：
    * 配置文件 ---读取--> Resource ---解析--> BeanDefinition ---注册--> 容器
    
* BeanFactory
    * Spring中生成的Bean都是由这个接口的实现类来管理的。
* FactoryBean<T> 
    * 也是一个Bean，用来生成普通的Bean

### # ApplicationContext常见容器
* 基于XML配置文件
    * FileSystemXmlApplicationContext   从文件系统中加载配置
    * ClasspathXmlApplicationContext    从类路径下加载配置
    * XmlWebApplicationContext  用于Web应用的容器
* 基于Java配置类与注解的容器
    * AnnotationConfigApplicationContext    
    * AnnotationConfigServletWebServerApplicationContext（SpringBoot）
    * AnnotationConfigReactiveWbeServerApplicationContext（SpringBoot）
    
* 基于XML与Java代码配置的容器都调用了refresh()方法 
* 核心类 `AbstractApplicationContext`

----
* ResourceLoader加载文件，返回`Resource`
![image.png](https://upload-images.jianshu.io/upload_images/1846623-f1a0946834805023.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* BeanDefinitionReader
    * 从Resource读取配置转换成BeanDefinition 
    ![image.png](https://upload-images.jianshu.io/upload_images/1846623-88633a84707ba43f.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


### 后置处理器PostProcessor
> 对容器或者Bean进行扩展
* 容器级别的后置处理器
    * BeanDefinitionRegistryPostProcessor
    * BeanFactoryPostProcessor
* Bean级别的后置处理器
    * BeanPostProcessor
    

### Aware接口

### 时间发布监听机制 
* ApplicationEvent
* ApplicationListener
* ApplicationEventMulticaster
    * AbstractApplicationEventMulticaster
        * SimpleApplicationEventMulticaster
* EventListenerMethodProcessor


### # 依赖注入
![image.png](https://upload-images.jianshu.io/upload_images/1846623-4bc9747df02dcaee.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



### #AOP
* 强制给目标类实现一个代码中没有实现的接口
    * @DeclareParents
