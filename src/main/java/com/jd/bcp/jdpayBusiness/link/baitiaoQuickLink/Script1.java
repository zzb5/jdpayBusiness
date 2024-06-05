package com.jd.bcp.jdpayBusiness.link.baitiaoQuickLink;

import com.jd.bcp.common.annotation.NodeScript;
import com.jd.bcp.common.utils.GsonUtil;
import com.jd.bcp.common.vo.CustomAction;
import com.jd.bcp.common.vo.ExecuteContext;
import com.jd.bcp.common.service.ScriptExecutor;
import com.jd.bcp.jdpayBusiness.common.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@NodeScript(nodeId = "preparePay")
public class Script1 implements ScriptExecutor {

    @Override
    public List<CustomAction<?>> execute(ExecuteContext executeContext) {
        List<CustomAction<?>> customActions = new ArrayList<>();
        CustomAction<User> userCustomAction = new CustomAction<>();
        customActions.add(userCustomAction);
        User user = new User();
        user.setName("Script1");
        userCustomAction.setCustomActionInfo(user);
        userCustomAction.setCustomActionType("user");
        return customActions;
    }
}
