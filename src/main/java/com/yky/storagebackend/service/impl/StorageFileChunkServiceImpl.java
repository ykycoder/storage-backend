package com.yky.storagebackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yky.storagebackend.model.entity.StorageFileChunk;
import com.yky.storagebackend.service.StorageFileChunkService;
import com.yky.storagebackend.mapper.StorageFileChunkMapper;
import org.springframework.stereotype.Service;

/**
* @author yky
* @description 针对表【storage_file_chunk(文件分片信息表)】的数据库操作Service实现
* @createDate 2024-12-23 21:12:37
*/
@Service
public class StorageFileChunkServiceImpl extends ServiceImpl<StorageFileChunkMapper, StorageFileChunk>
    implements StorageFileChunkService{

}




