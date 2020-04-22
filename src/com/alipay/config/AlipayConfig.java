package com.alipay.config;

public class AlipayConfig {
	// 商户appid
	public static String APPID = "2016101200669513";
	// 私钥 pkcs8格式的
	public static String RSA_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCPj4NaFiWWnduRgltJfla4wyMvQ+muY5zNo1ux+bKo+dzsG4yOxct/vizYLEq5nh/3CV0ObvVYU46a7DALp+Iic60aixlrthrfqwSDZ0Xa3rH40MAI6/fwpOBwjnQY85v6Q/3Lrrad+Mfj+5FZW91I3EpvEdIsBarN5FQJGG5khDeeYMF0iPQPwtCMy2PFoV5MO1fr5sy8uzWrHBJktn2jwphyAOF8IbSbcF79YsJ3otxJ6Bd72dNtZz8dqGEhTPkPSle6CrCWX9NfhpAITLOqVpN0O5veUHj4BTRitnndvzxLYtlIii9ufEPKr+AacwLEv9pf1cqJJkeTicGuG/EbAgMBAAECggEAZaWkyG1z8eAVrkKRZkkpGCs6x2WbmNl5FfU7oJl/EbvQ2/BpplGQVAOQdwNtaV33ng+oLucLmp2XFER1hFs7d09WWrvwpN5Myt+pE21U/bK+asFLp0WEyYPEUo3a0Cv03c+0bLppHRMgXWErOg0cclFf9qK0oGzm0l9/zOzahRozU3cXb6J0lPjfuMhsyFH5Ad4SL1mV9mg0PBnt8H9g9vlPcHynb6TfxF/P/LIb139YpAwVDFSoNW+WsGy4EHjxSvaQhSIPUBKyu08VSmZJqJmZ7D4ZcnrDn4+5x8tpUi4OcIcRS7dJPUNGkcXYcxv7YMEsR3/HYFVig4DF2HPz8QKBgQDYk5H6ZICL5kUj4T3VNOCdw0imMLZ+CCSG9rzNSiJx5aq7DWDfWhCJMkjqyAcLVo0nPDXBkIF/VWYxBRL4Lu5TPjfaRLeK4YzI3/nl+SX170KNwDY8xcYZh5oJhx1mjD9e7ESYJz55b6wi/uRJMX1b+yRInXM0JMezX+f/YVxJowKBgQCpsWpTomV5vIvmEdc4gktmj5tBwhjb5MFvTB5hTy4XXsVeWfMISGK5MX22xbk8D40UsSnXg6EVCnBwtdRC2Jmt/6396NsviWU5FTDCvpzXPGdRnzYPR6dO7OCrbnNqpFEd42eecZ+3fjCDuBTGdz5AQ2D8QlJDgXpUZkfjEwmiKQKBgQDWfpjmH2F8rQuu9GZz4ZHQTdeG2Nn0yoW6sWXd/91LZoYICcD2lFGqP4YeGQt4/DiCMkyfL0pB3Ud/pyHZcUmSYh2Y69PIFYiEbecnD/G7uEH29/X/jHSdVkKFyy6gIKimj2OEOeHTDXmzkzRvFTetwHZ4AJBXhVHPYl33/OoU9wKBgCuOhJJPHujugqJddfblSuFafymT3rmisBwXV7z2jAgnpVWglQdNPTn4ACLIAdHu0/G5v9m3ycMS2OW1ZnR6EIhfFpQUDx7Wj4rla4yxTKTatlJ3IXMumz1hBBI82ZdH8iJP2qsK00pQM7e7qml+9hWctepKQ79cHsBHOLCKlHBxAoGAC83Y5yqngz2NJGlJBNue5EGl0IYOvpXkgOMiY2NHFDobUXQJ4/+WjJ+2Qa6Q9AckDb79uYsmjM6LrSnh5wkpYITYpeJvv0PEmCkFtgsUZLuu0ibU2y1GHIU/X4BLeo1zTP3YCTQfSFyi5fA8sfqnF9NS3Nu+ZnVd84mtzr86oUw=";
	// 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://srdp-vm.cn/VMserver/notify_url.jsp";
	// 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
	public static String return_url = "http://srdp-vm.cn/VMserver/return_url.jsp";
	// 请求网关地址
	public static String URL = "https://openapi.alipaydev.com/gateway.do";
	// 编码
	public static String CHARSET = "UTF-8";
	// 返回格式
	public static String FORMAT = "json";
	// 支付宝公钥
	public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlm/hrUHHFnI+lBdagaywWt+wZbgP7+yXUEnoYWTbRMW8T93xSUd+XRcqDIhcUxnHI0mO+GAo8v/Y+Cg24MKGirwmakKhYhukW3xTAEFylPaX/qaW9pX3Q31BCbRV5YEepuh/3nDrYrcX1A6NUlxwDyWDaEF0jacRnTTyb+5xjqFHQMGSk2GIiOmpkVxxeKFG/VN545eYyIHLu7yqP8K8qE3icTWl2I0uEXHUCNk/+Y6SbzKxZLe7vZbJqnSHUN7ZKLH8Bh9Rg6MhX87AOQOAMBQB3vyBtMWEVvYusfgNYehUmTtSGJyOUaXyrzvYAEw+UBtN+UxIUzxIyuubBew1+QIDAQAB";
	// 日志记录目录
	public static String log_path = "/log";
	// RSA2
	public static String SIGNTYPE = "RSA2";
}
