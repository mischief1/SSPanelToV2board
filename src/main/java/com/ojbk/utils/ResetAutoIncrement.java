package com.ojbk.utils;

/**
 * @author: WeiMingYan
 * @Title: ResetAutoIncrement
 * @ProjectName: SSPanelToV2board
 * @Description:
 * @date: 2022/1/27 13:49
 */
public class ResetAutoIncrement {

    public  static String ResetAutoIncrementForTable(){
        return "dbcc checkident('t1',reseed,1)";
    }
}
