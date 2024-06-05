package com.jd.bcp.jdpayBusiness.link.baitiaoQuickLink;

import com.jd.bcp.common.utils.GsonUtil;
import com.jd.bcp.jdpayBusiness.common.User;

import java.util.HashMap;
import java.util.Map;

public class Script2 {
    public Map<String, String> execute(String data) {
        User user = GsonUtil.fromJson(data, User.class);
        System.out.println(user.getName());
        System.out.println(user.getAge());
        Map<String, String> result = new HashMap<>();
        result.put(user.getName(), user.getAge());
        return result;
    }
}
