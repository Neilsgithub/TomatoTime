package com.time.tomato.entity;

import java.io.Serializable;

/**
 * ����ʵ����
 */
public class TomatoEntity implements Serializable {
	private static final long serialVersionUID = 7715082767404898634L;
	/** ����id */
	public Integer id;
	/** �������� */
	public String content;
	/** �����Ƿ��ö� */
	public Long isTop;
	/** �����Ƿ���� */
	public Long isFinished;
	/** �����Ƿ���Ҫ */
	public Long isImportant;

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

	public Long getIsTop() {
		return isTop;
	}

	public void setIsTop(Long isTop) {
		this.isTop = isTop;
	}

	public Long getIsFinished() {
		return isFinished;
	}

	public void setIsFinished(Long isFinished) {
		this.isFinished = isFinished;
	}

	public Long getIsImportant() {
		return isImportant;
	}

	public void setIsImportant(Long isImportant) {
		this.isImportant = isImportant;
	}

}
