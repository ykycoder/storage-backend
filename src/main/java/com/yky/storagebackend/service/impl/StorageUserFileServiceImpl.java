package com.yky.storagebackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yky.storagebackend.model.entity.StorageUserFile;
import com.yky.storagebackend.service.StorageUserFileService;
import com.yky.storagebackend.mapper.StorageUserFileMapper;
import org.springframework.stereotype.Service;

/**
* @author yky
* @description 针对表【storage_user_file(用户文件信息表)】的数据库操作Service实现
* @createDate 2024-12-23 21:12:37
*/
@Service
public class StorageUserFileServiceImpl extends ServiceImpl<StorageUserFileMapper, StorageUserFile>
    implements StorageUserFileService{

}




