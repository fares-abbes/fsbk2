package com.mss.unified.references;

public class EmvTag {
	
	private String tagEmv;
	private String tagValue;
	
	public EmvTag(String tagEmv, String tagValue)
	{
		this.tagEmv=tagEmv;
		this.tagValue=tagValue;
	}

	public String getTagEmv() {
		return tagEmv;
	}

	public void setTagEmv(String tagEmv) {
		this.tagEmv = tagEmv;
	}

	public String getTagValue() {
		return tagValue;
	}

	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

	
}
