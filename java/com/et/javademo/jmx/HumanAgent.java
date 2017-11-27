package com.et.javademo.jmx;

import com.et.javademo.jmx.impl.HumanMBeanImpl;
import com.sun.jdmk.comm.HtmlAdaptorServer;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.modelmbean.*;
import java.lang.management.ManagementFactory;

public class HumanAgent {

    public static void main(String[] args) throws Exception {
        //获取MBean的平台服务
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

        // 对即将被注册的MBean 构造一个ObjectName
        ObjectName objectName = new ObjectName("com.et.javademo.jmx:name=human");
        // 创建一个Mbean
        HumanMBean humanMBean = new HumanMBeanImpl();
        RequiredModelMBean mbean = new RequiredModelMBean();
        mbean.setManagedResource(humanMBean, "objectReference");

        ModelMBeanAttributeInfo name = new ModelMBeanAttributeInfo("name", "java.lang.String",
                "userName", true, true, false, new DescriptorSupport(new String[] { "name=name",
                "descriptorType=attribute", "getMethod=getName", "setMethod=setName" }));

        ModelMBeanOperationInfo sayHello = new ModelMBeanOperationInfo("say Hello", humanMBean.getClass().getMethod("sayHello"));
        // 创建一个ModelMBeanOperationInfo
        ModelMBeanOperationInfo getName = new ModelMBeanOperationInfo("get userName", humanMBean.getClass().getMethod("getName"));

        // 使用ModelMbeanAttributeInfo和ModelMbeanOperationInfo构建一个ModelMBeanInfo对象
        ModelMBeanInfo mbeanInfo = new ModelMBeanInfoSupport("HiMbean", "Test",
                new ModelMBeanAttributeInfo[] { name }, null, new ModelMBeanOperationInfo[] { sayHello, getName }, null);
        // 向ModelMBean 设置ModelMBeanInfo
        mbean.setModelMBeanInfo(mbeanInfo);

        // 将Mbean 注册到MBeanServer
        mbs.registerMBean(mbean, objectName);

        // 创建一个HtmlAdapterServer MBean
        HtmlAdaptorServer htmlAdaptorServer = new HtmlAdaptorServer();
        // 修改端口号
        htmlAdaptorServer.setPort(8082);
        // 将html适配器MBean 注入到MBeanServer,该处port仅仅是描述
        mbs.registerMBean(htmlAdaptorServer, new ObjectName("Adaptor:name=html,port=8082"));
        // 启动适配器
        htmlAdaptorServer.start();

        // 一直等待
        System.out.println("Waiting forever...");
        Thread.sleep(Long.MAX_VALUE);
    }

}
