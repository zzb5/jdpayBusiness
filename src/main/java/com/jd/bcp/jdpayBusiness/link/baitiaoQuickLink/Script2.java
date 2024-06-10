package com.jd.bcp.jdpayBusiness.link.baitiaoQuickLink;

import com.jd.bcp.export.annotation.NodeScript;
import com.jd.bcp.export.custom.CustomAction;
import com.jd.bcp.export.custom.CustomManager;
import com.jd.bcp.export.custom.ReportAlertCustomVo;
import com.jd.bcp.export.enums.CustomActionTypeEnum;
import com.jd.bcp.export.service.JavaExecutor;
import com.jd.bcp.export.vo.ExecuteContext;
import com.jd.bcp.jdpayBusiness.common.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@NodeScript(nodeId = "pay")
public class Script2 implements JavaExecutor {

    @Override
    public List<CustomAction<?>> execute(ExecuteContext executeContext) {
        List<CustomAction<?>> customActions = new ArrayList<>();
        CustomAction<ReportAlertCustomVo> reportAlert = CustomManager.build(CustomActionTypeEnum.REPORT_ALERT);
        reportAlert.setCustomActionInfo(new ReportAlertCustomVo("pay接口异常"));
        customActions.add(reportAlert);
        return customActions;
    }
}
