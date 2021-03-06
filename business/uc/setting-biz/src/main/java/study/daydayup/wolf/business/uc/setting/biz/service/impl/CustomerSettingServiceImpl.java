package study.daydayup.wolf.business.uc.setting.biz.service.impl;

import lombok.NonNull;
import org.springframework.beans.BeanUtils;
import org.springframework.validation.annotation.Validated;
import study.daydayup.wolf.business.uc.setting.api.dto.SettingDTO;
import study.daydayup.wolf.business.uc.setting.api.entity.CustomerSetting;
import study.daydayup.wolf.business.uc.setting.api.entity.KvData;
import study.daydayup.wolf.business.uc.setting.api.service.CustomerSettingService;
import study.daydayup.wolf.business.uc.setting.biz.dal.dao.CustomerSettingDAO;
import study.daydayup.wolf.business.uc.setting.biz.dal.dataobject.CustomerSettingDO;
import study.daydayup.wolf.framework.rpc.Result;
import study.daydayup.wolf.framework.rpc.RpcService;

import javax.annotation.Resource;
import java.util.List;

/**
 * study.daydayup.wolf.business.uc.setting.biz.service.impl
 *
 * @author Wingle
 * @since 2020/1/1 12:39 下午
 **/
@RpcService
public class CustomerSettingServiceImpl implements CustomerSettingService {
    @Resource
    private CustomerSettingDAO dao;

    @Override
    public Result<CustomerSetting> find(@NonNull Long accountId, @NonNull Long orgId) {
        CustomerSettingDO customerSettingDO = dao.findByNamespace(KvData.DEFAULT_NAMESPACE, accountId, orgId);
        if (customerSettingDO == null) {
            return initSetting(accountId, orgId);
        }
        CustomerSetting setting = DOToModel(customerSettingDO);
        return Result.ok(setting);
    }

    @Override
    public Result<Integer> replace(@Validated CustomerSetting customerSetting) {
        int status;
        CustomerSettingDO customerSettingDO = dao.findByNamespace(KvData.DEFAULT_NAMESPACE, customerSetting.getAccountId(), customerSetting.getOrgId());
        if (customerSettingDO == null) {
            status = dao.insertSelective(modelToDO(customerSetting));
            return Result.ok(status);
        }

        status = dao.updateByAccountId(modelToDO(customerSetting), customerSetting.getAccountId(), customerSetting.getOrgId());
        return Result.ok(status);
    }

    @Override
    public Result<Integer> set(SettingDTO settingDTO) {
        return null;
    }

    @Override
    public Result<List<CustomerSetting>> findByNamespaces(SettingDTO settingDTO) {
        return null;
    }

    @Override
    public Result<List<CustomerSetting>> findAll(Long accountId) {
        return null;
    }

    private Result<CustomerSetting> initSetting(Long accountId, Long orgId) {
        CustomerSetting status = new CustomerSetting();
        status.setAccountId(accountId);
        status.setOrgId(orgId);

        CustomerSettingDO statusDO = modelToDO(status);
        dao.insertSelective(statusDO);

        return Result.ok(status);
    }

    private CustomerSetting DOToModel(CustomerSettingDO customerSettingDO) {
        if (customerSettingDO == null) {
            return null;
        }

        CustomerSetting customerSetting = new CustomerSetting();
        BeanUtils.copyProperties(customerSettingDO, customerSetting);

        return customerSetting;
    }

    private CustomerSettingDO modelToDO(CustomerSetting customerSetting) {
        if (customerSetting == null) {
            return null;
        }

        CustomerSettingDO customerSettingDO = new CustomerSettingDO();
        BeanUtils.copyProperties(customerSetting, customerSettingDO);

        return customerSettingDO;
    }

}
