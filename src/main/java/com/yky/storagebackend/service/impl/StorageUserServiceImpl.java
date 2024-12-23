package com.yky.storagebackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yky.storagebackend.model.entity.StorageUser;
import com.yky.storagebackend.service.StorageUserService;
import com.yky.storagebackend.mapper.StorageUserMapper;
import org.springframework.stereotype.Service;

/**
* @author yky
* @description 针对表【storage_user(用户信息表)】的数据库操作Service实现
* @createDate 2024-12-23 21:11:43
*/
@Service
public class StorageUserServiceImpl extends ServiceImpl<StorageUserMapper, StorageUser>
    implements StorageUserService{

}




