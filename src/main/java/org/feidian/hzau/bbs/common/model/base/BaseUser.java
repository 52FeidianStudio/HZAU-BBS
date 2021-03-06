package org.feidian.hzau.bbs.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseUser<M extends BaseUser<M>> extends Model<M> implements IBean {

    public M setId(java.lang.Long id) {
        set("id", id);
        return (M) this;
    }

    public java.lang.Long getId() {
        return getLong("id");
    }

    public M setUsername(java.lang.String username) {
        set("username", username);
        return (M) this;
    }

    public java.lang.String getUsername() {
        return getStr("username");
    }

    public M setNumber(java.lang.String number) {
        set("number", number);
        return (M) this;
    }

    public java.lang.String getNumber() {
        return getStr("number");
    }

    public M setEmail(java.lang.String email) {
        set("email", email);
        return (M) this;
    }

    public java.lang.String getEmail() {
        return getStr("email");
    }

    public M setMobile(java.lang.String mobile) {
        set("mobile", mobile);
        return (M) this;
    }

    public java.lang.String getMobile() {
        return getStr("mobile");
    }

    public M setEnable(java.lang.Boolean enable) {
        set("enable", enable);
        return (M) this;
    }

    public java.lang.Boolean getEnable() {
        return get("enable");
    }

    public M setUpdateTime(java.util.Date updateTime) {
        set("update_time", updateTime);
        return (M) this;
    }

    public java.util.Date getUpdateTime() {
        return get("update_time");
    }

    public M setCreateTime(java.util.Date createTime) {
        set("create_time", createTime);
        return (M) this;
    }

    public java.util.Date getCreateTime() {
        return get("create_time");
    }

}
