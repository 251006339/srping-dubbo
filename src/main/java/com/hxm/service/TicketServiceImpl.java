package com.hxm.service;


import com.alibaba.dubbo.config.annotation.Service;

import org.springframework.stereotype.Component;

/**
 * @author XAIOHU
 * @date 2019/9/26 --16:51
 * 1.将服务提供者注册到从中心
 *    1引入dubbo和zkclient相关y
 *
 **/
@Component
@Service  //将服务发布出去
public class TicketServiceImpl implements  TicketService{

    public String getTicket(){
        return "<<厉害了我的国>>";
    }
}
