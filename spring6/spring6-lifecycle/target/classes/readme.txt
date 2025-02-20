第一：只有正常关闭spring容器，bean的销毁方法才会执行
第二：ClassPathXmlApplicationContext类中才有close()方法
第三：配置文件中的init-method指定初始化方法，destroy-method指定销毁方法
Bean的生命周期之五步：
实例化bean--》bean属性赋值--》初始化bean--》使用bean--》销毁bean
Bean的生命周期之七步
实例化bean--》bean属性赋值--》bean后处理器的before方法执行--》初始化bean--》bean后处理器的after方法执行--》使用bean--》销毁bean
Bean的生命周期之十步
实例化bean--》bean属性赋值--》检查bean是否实现了Aware的相关接口，并设置相关依赖--》bean后处理器的before方法执行--》检查bean是否实现了InitializingBean接口，并调用接口方法--》初始化bean--》bean后处理器的after方法执行--》使用bean--》检查bean是否实现了DisposableBean接口，并调用接口方法--》销毁bean
Aware相关的接口包括：BeanNameAware、BeanClassLoaderAware、BeanFactoryAware
● 当Bean实现了BeanNameAware，Spring会将Bean的名字传递给Bean。
● 当Bean实现了BeanClassLoaderAware，Spring会将加载该Bean的类加载器传递给Bean。
● 当Bean实现了BeanFactoryAware，Spring会将Bean工厂对象传递给Bean。
测试以上10步，可以让User类实现5个接口，并实现所有方法：
● BeanNameAware
● BeanClassLoaderAware
● BeanFactoryAware
● InitializingBean
● DisposableBean