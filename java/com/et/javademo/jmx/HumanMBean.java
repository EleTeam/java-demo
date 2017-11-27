package com.et.javademo.jmx;

import javax.management.DynamicMBean;

public interface HumanMBean {

    /**
     *打招呼
     */
    public void sayHello();

    /**
     * 加法计算器
     *
     * @param x
     * @param y
     * @return
     */
    public int add(int x, int y);

    /**
     * 获取名称
     *
     * @return
     */
    public String getName();

    /**
     *获取缓存大小
     *
     * @return
     */
    public int getCacheSize();

    /**
     *设置缓存大小
     *
     * @param size
     */
    public void setCacheSize(int size);

}
