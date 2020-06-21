package com.github.rwocj.wx.service;

import com.github.rwocj.wx.base.WxPayException;
import com.github.rwocj.wx.dto.WxCreateOrderRequest;
import com.github.rwocj.wx.enums.OrderType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import javax.annotation.Resource;
import java.util.ResourceBundle;
import java.util.UUID;

@SpringBootTest
@ActiveProfiles("test")
class WxPayV3ServiceTest {

    @Resource
    private WxPayV3Service wxPayV3Service;

    @Test
    void nativeCreateOrder() throws WxPayException {
        WxCreateOrderRequest request = new WxCreateOrderRequest();
        request.setOrderType(OrderType.jsapi);
        request.setDescription("测试商品");
        request.setOutTradeNo(UUID.randomUUID().toString().replaceAll("-", ""));
        request.setAmount(WxCreateOrderRequest.Amount.builder().total(10).build());
        request.setPayer(WxCreateOrderRequest.Payer.builder().openid("oT5Pk5GxcjYfGQ-MCLi0QRp45Quc").build());
        String prepay_id = wxPayV3Service.createOrder(request);
        System.out.println("prepay_id:" + prepay_id);
        Assertions.assertNotNull(prepay_id);

    }

    @BeforeAll
    static void before() {
        Assertions.assertDoesNotThrow(() -> ResourceBundle.getBundle("application-test"), "未找到application-test.properties文件！");
    }

}
