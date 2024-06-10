package com.jd.bcp.jdpayBusiness.link.commonLink;

import com.jd.bcp.export.annotation.NodeScript;
import com.jd.bcp.export.custom.CustomAction;
import com.jd.bcp.export.custom.CustomManager;
import com.jd.bcp.export.custom.ReportAlertCustomVo;
import com.jd.bcp.export.enums.CustomActionTypeEnum;
import com.jd.bcp.export.service.JavaExecutor;
import com.jd.bcp.export.vo.ExecuteContext;

import java.util.ArrayList;
import java.util.List;

@NodeScript(nodeId = "pay")
public class Script4 implements JavaExecutor {

    @Override
    public List<CustomAction<?>> execute(ExecuteContext executeContext) {
        List<CustomAction<?>> customActions = new ArrayList<>();
        CustomAction<ReportAlertCustomVo> reportAlert = CustomManager.build(CustomActionTypeEnum.REPORT_ALERT);
        reportAlert.setCustomActionInfo(new ReportAlertCustomVo("pay接口异常, 第一次修改"));
        customActions.add(reportAlert);
        return customActions;
    }
}
