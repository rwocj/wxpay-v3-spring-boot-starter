package com.github.rwocj.wx.properties;

public class WxPayProperties {
    /**
     * 微信支付商户号
     *
     * @required
     */
    private String mchId;

    /**
     * 微信支付证书序列号
     *
     * @required
     */
    private String certificateSerialNo;

    /**
     * v3接口密钥
     *
     * @required
     */
    private String apiV3Key;

    /**
     * 微信支付私钥文件resource路径,如classpath:/cert/app.pem
     *
     * @required
     */
    private String privateKeyPath;

    /**
     * 支付通知地址
     *
     * @required
     */
    private String notifyUrl;

    /**
     * 退款通知地址
     */
    private String refundNotifyUrl;

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getCertificateSerialNo() {
        return certificateSerialNo;
    }

    public void setCertificateSerialNo(String certificateSerialNo) {
        this.certificateSerialNo = certificateSerialNo;
    }

    public String getApiV3Key() {
        return apiV3Key;
    }

    public void setApiV3Key(String apiV3Key) {
        this.apiV3Key = apiV3Key;
    }

    public String getPrivateKeyPath() {
        return privateKeyPath;
    }

    public void setPrivateKeyPath(String privateKeyPath) {
        this.privateKeyPath = privateKeyPath;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getRefundNotifyUrl() {
        return refundNotifyUrl;
    }

    public void setRefundNotifyUrl(String refundNotifyUrl) {
        this.refundNotifyUrl = refundNotifyUrl;
    }
}
