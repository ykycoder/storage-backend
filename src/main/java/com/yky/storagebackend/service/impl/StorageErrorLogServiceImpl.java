package com.yky.storagebackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yky.storagebackend.model.entity.StorageErrorLog;
import com.yky.storagebackend.service.StorageErrorLogService;
import com.yky.storagebackend.mapper.StorageErrorLogMapper;
import org.springframework.stereotype.Service;

/**
* @author yky
* @description 针对表【storage_error_log(错误日志表)】的数据库操作Service实现
* @createDate 2024-12-23 21:15:19
*/
@Service
public class StorageErrorLogServiceImpl extends ServiceImpl<StorageErrorLogMapper, StorageErrorLog>
    implements StorageErrorLogService{

}




