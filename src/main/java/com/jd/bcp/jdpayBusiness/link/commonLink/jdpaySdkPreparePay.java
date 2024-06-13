package com.jd.bcp.jdpayBusiness.link.commonLink;


import com.jd.bcp.export.annotation.NodeScript;
import com.jd.bcp.export.custom.CustomAction;
import com.jd.bcp.export.custom.CustomManager;
import com.jd.bcp.export.custom.ReportAlertCustomVo;
import com.jd.bcp.export.custom.ReportUmpCustomVo;
import com.jd.bcp.export.enums.CustomActionTypeEnum;
import com.jd.bcp.export.service.JavaExecutor;
import com.jd.bcp.export.vo.ExecuteContext;

import java.util.ArrayList;
import java.util.List;

public class jdpaySdkPreparePay implements JavaExecutor {

    @Override
    public List<CustomAction<?>> execute(ExecuteContext executeContext) {
        List<CustomAction<?>> customActions = new ArrayList<>();
        CustomAction<ReportUmpCustomVo> reportUmp = CustomManager.build(CustomActionTypeEnum.REPORT_UMP);
        CustomAction<ReportAlertCustomVo> reportAlert = CustomManager.build(CustomActionTypeEnum.REPORT_ALERT);
        reportAlert.setCustomActionInfo(new ReportAlertCustomVo("preparePay接口异常, 第三次修改"));
        reportUmp.setCustomActionInfo(new ReportUmpCustomVo("preparePay接口上报UMP"));
        customActions.add(reportAlert);
        customActions.add(reportUmp);
        return customActions;
    }
}
