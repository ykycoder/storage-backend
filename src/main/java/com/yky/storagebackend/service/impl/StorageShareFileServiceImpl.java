package com.yky.storagebackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yky.storagebackend.model.entity.StorageShareFile;
import com.yky.storagebackend.service.StorageShareFileService;
import com.yky.storagebackend.mapper.StorageShareFileMapper;
import org.springframework.stereotype.Service;

/**
* @author yky
* @description 针对表【storage_share_file(用户分享文件表)】的数据库操作Service实现
* @createDate 2024-12-23 21:15:34
*/
@Service
public class StorageShareFileServiceImpl extends ServiceImpl<StorageShareFileMapper, StorageShareFile>
    implements StorageShareFileService{

}




