package com.yky.storagebackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yky.storagebackend.model.entity.StorageFile;
import com.yky.storagebackend.service.StorageFileService;
import com.yky.storagebackend.mapper.StorageFileMapper;
import org.springframework.stereotype.Service;

/**
* @author yky
* @description 针对表【storage_file(物理文件信息表)】的数据库操作Service实现
* @createDate 2024-12-23 21:12:37
*/
@Service
public class StorageFileServiceImpl extends ServiceImpl<StorageFileMapper, StorageFile>
    implements StorageFileService{

}




