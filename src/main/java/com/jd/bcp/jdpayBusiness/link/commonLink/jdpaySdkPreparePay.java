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

public class jdpaySdkPreparePay implements JavaExecutor {

    @Override
    public List<CustomAction<?>> execute(ExecuteContext executeContext) {
        List<CustomAction<?>> customActions = new ArrayList<>();
        CustomAction<ReportAlertCustomVo> reportAlert = CustomManager.build(CustomActionTypeEnum.REPORT_ALERT);
        reportAlert.setCustomActionInfo(new ReportAlertCustomVo("preparePay接口异常, 第三11次修改"));
        customActions.add(reportAlert);
        return customActions;
    }
}
