package com.ojbk.controller;

import com.ojbk.service.*;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/SSPanelToV2board")
public class SSPanelToV2boardController {
    @Resource
    private UserService userService;
    @Resource
    private CouponService couponService;
    @Resource
    private SsInviteCodeService ssInviteCodeService;
    @Resource
    private BoughtService boughtService;

    //转换user表
    @GetMapping("/user")
    public Map<String,Integer> ConversionUser(){
        HashMap<String, Integer> map = new HashMap<>();
        //转换user表
        int userTable = userService.ConversionUserTable();
        map.put("转换user表数量：",userTable);
        System.out.println("成功转换"+userTable+"条user表数据！");
        return map;
    }

    //转换coupon表
    @GetMapping("/coupon")
    public Map<String,Integer> ConversionCoupon(){
        HashMap<String, Integer> map = new HashMap<>();
        //转换coupon表
        int couponTable = couponService.ConversionCouponTable();
        map.put("转换coupon表数量：",couponTable);
        System.out.println("成功转换"+couponTable+"条coupon表数据！");
        return map;
    }

    //转换邀请码表
    @GetMapping("/ssInviteCode")
    public Map<String,Integer> ConversionSsInviteCode() throws ParseException {
        HashMap<String, Integer> map = new HashMap<>();
        //转换ss_invite_code表
        int SsInviteCodeTable = ssInviteCodeService.ConversionSsInviteCodeTable();
        map.put("转换ss_invite_code表数量：",SsInviteCodeTable);
        System.out.println("成功转换"+SsInviteCodeTable+"条ss_invite_code表数据！");
        return map;
    }

    //转换订单表
    @GetMapping("/bought")
    public Map<String,Integer> ConversionBought() throws Exception {
        HashMap<String, Integer> map = new HashMap<>();
        //转换order表
        int BoughtTable = boughtService.ConversionBoughtTable();
        map.put("转换bought表数量：",BoughtTable);
        System.out.println("成功转换"+BoughtTable+"条bought表数据！");
        return map;
    }

    //sspanel数据库表转v2board数据库表整合
    @GetMapping("/all")
    public Map<String,Integer> ConversionAll() throws Exception {
        HashMap<String, Integer> map = new HashMap<>();
        //转换user表
        int userTable = userService.ConversionUserTable();
        map.put("转换user表数量：",userTable);
        //转换coupon表
        int couponTable = couponService.ConversionCouponTable();
        map.put("转换coupon表数量：",couponTable);
        //转换ss_invite_code表
        int SsInviteCodeTable = ssInviteCodeService.ConversionSsInviteCodeTable();
        map.put("转换ss_invite_code表数量：",SsInviteCodeTable);
        //转换order表
        int BoughtTable = boughtService.ConversionBoughtTable();
        map.put("转换bought表数量：",BoughtTable);
        map.put("总共转换记录数：",userTable + couponTable + SsInviteCodeTable + BoughtTable);
        return map;
    }
}
