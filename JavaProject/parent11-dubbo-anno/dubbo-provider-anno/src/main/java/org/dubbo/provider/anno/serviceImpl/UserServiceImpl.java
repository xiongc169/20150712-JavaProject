package org.dubbo.provider.anno.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import org.dubbo.common.anno.facade.UserService;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String getUserName() {
        //2017-10-25 15:00:54
        String userName = "yoong —— " + format.format(new Date());
        return userName;
    }

}
