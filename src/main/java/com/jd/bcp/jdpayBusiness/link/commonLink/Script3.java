package com.jd.bcp.jdpayBusiness.link.commonLink;

import com.jd.bcp.common.utils.GsonUtil;
import com.jd.bcp.jdpayBusiness.common.User;

import java.util.HashMap;
import java.util.Map;

public class Script3 {
    public Map<String, String> execute(String data) {
        User user = GsonUtil.fromJson(data, User.class);
        Map<String, String> result = new HashMap<>();
        result.put(user.getName(), user.getAge());
        result.put(user.getAge(), user.getName());
        return result;
    }
}
