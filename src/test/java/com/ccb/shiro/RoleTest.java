package com.ccb.shiro;

import com.ccb.shiro.common.ShiroUtil;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

import java.util.Arrays;

public class RoleTest {

    @Test
    public void testHasRole() {
        Subject currentUser = ShiroUtil.login("classpath:shiro_role.ini","java1234","123456");
        System.out.println(currentUser.hasRole("role1")?"有role1角色":"无role1角色");

        boolean result[] = currentUser.hasRoles(Arrays.asList("role1","role2","role3"));
        System.out.println(result[0]?"有role1角色":"无role1角色");
        System.out.println(result[1]?"有role2角色":"无role2角色");
        System.out.println(result[2]?"有role3角色":"无role3角色");

        System.out.println(currentUser.hasAllRoles(Arrays.asList("role1","role2","role3"))?"拥有全部角色":"角色不全有");

        currentUser.logout();
    }

    @Test
    public void testCheckRole() {
        Subject currentUser = ShiroUtil.login("classpath:shiro_role.ini","java1234","123456");
        currentUser.checkRole("role1");
        currentUser.checkRoles(Arrays.asList("role1","role2","role3"));
        currentUser.logout();

    }
}
