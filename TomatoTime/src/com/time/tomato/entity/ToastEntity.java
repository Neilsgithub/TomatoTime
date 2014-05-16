package com.time.tomato.entity;

import java.io.Serializable;

/**
 * ����ʵ����
 */
public class ToastEntity implements Serializable {
	private static final long serialVersionUID = 7715082767404898634L;
	/** ����id */
	public Integer id;
	/** �������� */
	public String content;
	/** �����Ƿ��ö� */
	public Boolean isTop;
	/** �����Ƿ���� */
	public Boolean isFinished;
	/** �����Ƿ���Ҫ */
	public Boolean isImportant;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Boolean getIsTop() {
		return isTop;
	}

	public void setIsTop(Boolean isTop) {
		this.isTop = isTop;
	}

	public Boolean getIsFinished() {
		return isFinished;
	}

	public void setIsFinished(Boolean isFinished) {
		this.isFinished = isFinished;
	}

	public Boolean getIsImportant() {
		return isImportant;
	}

	public void setIsImportant(Boolean isImportant) {
		this.isImportant = isImportant;
	}

}
