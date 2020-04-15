package com.json.netty.util;

public class JsonResult {

	private String basicRef;
	private String basicTid;
	private String basicRemark;
	private String ops;

	public JsonResult assignValue(String basicRef, String basicTid, String basicRemark, String ops) {
		JsonResult jres = new JsonResult();
		jres.setBasicRef(basicRef);
		jres.setBasicRemark(basicRemark);
		jres.setBasicTid(basicTid);
		jres.setOps(ops);
		return jres;
	}

	public String getBasicRef() {
		return basicRef;
	}

	public void setBasicRef(String basicRef) {
		this.basicRef = basicRef;
	}

	public String getBasicTid() {
		return basicTid;
	}

	public void setBasicTid(String basicTid) {
		this.basicTid = basicTid;
	}

	public String getBasicRemark() {
		return basicRemark;
	}

	public void setBasicRemark(String basicRemark) {
		this.basicRemark = basicRemark;
	}

	public String getOps() {
		return ops;
	}

	public void setOps(String ops) {
		this.ops = ops;
	}

}