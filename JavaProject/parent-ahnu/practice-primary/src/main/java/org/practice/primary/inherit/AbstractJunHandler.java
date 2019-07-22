package org.practice.primary.inherit;

import java.util.Date;

/**
 * @Desc AbstractJunHandler
 * Java类报错：Class '***' must either be declared abstract or implement abstract method '***’
 * PS：非抽象类中不能声明抽象方法；
 * https://blog.csdn.net/leo_huang720/article/details/82721845
 * <p>
 * @Author
 * @Date 2019年3月28日20:35:35
 * @Version 1.0
 */
public class AbstractJunHandler extends AbstractBaseHandler<Long, String> {

    @Override
    public String handle(Long param) {
        return format.format(new Date()) + param;
    }

}