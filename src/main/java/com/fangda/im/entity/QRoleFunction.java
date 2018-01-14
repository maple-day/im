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
@TableName("q_role_function")
public class QRoleFunction extends Model<QRoleFunction> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色id
     */
	@TableId("role_id")
	private String roleId;
    /**
     * 权限id
     */
	@TableField("function_id")
	private String functionId;


	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getFunctionId() {
		return functionId;
	}

	public void setFunctionId(String functionId) {
		this.functionId = functionId;
	}

	@Override
	protected Serializable pkVal() {
		return this.roleId;
	}

}
