package com.yky.storagebackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yky.storagebackend.model.entity.StorageShare;
import com.yky.storagebackend.service.StorageShareService;
import com.yky.storagebackend.mapper.StorageShareMapper;
import org.springframework.stereotype.Service;

/**
* @author yky
* @description 针对表【storage_share(用户分享表)】的数据库操作Service实现
* @createDate 2024-12-23 21:15:34
*/
@Service
public class StorageShareServiceImpl extends ServiceImpl<StorageShareMapper, StorageShare>
    implements StorageShareService{

}




