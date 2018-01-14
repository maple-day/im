package com.fangda.im.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;


/**
 * <p>
 * 
 * </p>
 *
 * @author davis
 * @since 2017-12-14
 */
@TableName("q_user_role")
public class QUserRole extends Model<QUserRole> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户主键id
     */
	@TableId("user_id")
	private String userId;
    /**
     * 角色主键id
     */
	@TableField("role_id")
	private String roleId;


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	@Override
	protected Serializable pkVal() {
		return this.userId;
	}

}
