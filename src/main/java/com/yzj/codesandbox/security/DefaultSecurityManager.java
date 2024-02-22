package com.yzj.codesandbox.security;

import java.security.Permission;

/**
 * 默认安全管理器
 */
public class DefaultSecurityManager extends SecurityManager {
    //检查所有权限
    @Override
    public void checkPermission(Permission perm) {
        // 这里可以根据需要进行权限检查
        System.out.println("默认不做任何限制");
        System.out.println(perm);
    }
}
