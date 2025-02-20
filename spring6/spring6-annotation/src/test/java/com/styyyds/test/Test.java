package com.styyyds.test;

import com.styyyds.annotation.Component;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        //存放Bean的Map集合，key存储beanId，value存储bean
        Map<String,Object> beanMap = new HashMap<>();

        String packageName = "com.styyyds.bean";
        String path = packageName.replaceAll("\\.","/");
        URL url = ClassLoader.getSystemClassLoader().getResource(path);
        System.out.println(url.getPath());
        File file = new File(url.getPath());
        File[] files = file.listFiles();
        Arrays.stream(files).forEach(f->{
            System.out.println(f.getName());
            String className = packageName + "." + f.getName().split("\\.")[0];
            try{
                Class<?> clazz = Class.forName(className);
                if(clazz.isAnnotationPresent(Component.class)){
                    Component component = clazz.getAnnotation(Component.class);
                    String beanId = component.value();
                    Object bean = clazz.newInstance();
                    beanMap.put(beanId,bean);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        });
        System.out.println(beanMap);
    }
}
