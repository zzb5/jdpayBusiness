package com.jd.bcp.jdpayBusiness.link.commonLink;

import com.jd.bcp.common.annotation.NodeScript;
import com.jd.bcp.common.service.JavaExecutor;
import com.jd.bcp.common.utils.GsonUtil;
import com.jd.bcp.common.vo.CustomAction;
import com.jd.bcp.common.vo.ExecuteContext;
import com.jd.bcp.jdpayBusiness.common.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@NodeScript(nodeId = "preparePay")
public class Script3 implements JavaExecutor {

    @Override
    public List<CustomAction<?>> execute(ExecuteContext executeContext) {
        List<CustomAction<?>> customActions = new ArrayList<>();
        CustomAction<User> userCustomAction = new CustomAction<>();
        customActions.add(userCustomAction);
        User user = new User();
        user.setName("Script3");
        userCustomAction.setCustomActionInfo(user);
        userCustomAction.setCustomActionType("user");
        return customActions;
    }
}
