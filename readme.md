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
