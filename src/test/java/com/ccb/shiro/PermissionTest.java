package com.ccb.shiro;

import com.ccb.shiro.common.ShiroUtil;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

public class PermissionTest {

    @Test
    public void testIsPermitted() {
        Subject currentUser = ShiroUtil.login("classpath:shiro_permission.ini","java1234","123456");

    }
}
