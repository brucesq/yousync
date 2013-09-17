package com.hunthawk.framework.util;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * ��ҳ�еķ�ҳ,��װ��ҳ������,ҳ������,���ṩ��һЩ���ַ���
 * <p>
 * ҳ����������Java�������ϰ�ߣ���0��ʼ.��չʾ��ʱ����Ҫ��ҳ���������д���
 * @author penglei
 */
public class Page implements Serializable {

	public static final long serialVersionUID = 1L;

	/**
	 * Ĭ�ϵ�ҳ���װ�ص�������Ŀ�ܺ�
	 */
	public static final int DEFAULT_DATA_SIZE_IN_ONE_PAGE = 10;

	/*
	 * ҳ���װ�ص�������Ŀ
	 */
	private int dataCountInOnePage = DEFAULT_DATA_SIZE_IN_ONE_PAGE;

	/*
	 * ��ǰҳ�������
	 */
	private int currentPageNo;

	/*
	 * ҳ������
	 */
	private List data;

	/*
	 * ���е�������Ŀ���������еķ�ҳ�������ۼӣ�
	 */
	private long totalDataCount;

	/**
	 * 
	 */
	public Page() {
		this(0, 0, DEFAULT_DATA_SIZE_IN_ONE_PAGE, Collections.EMPTY_LIST);
	}

	/**
	 * @param currentPageNo
	 *            ��ǰҳ�������
	 * @param totalCount
	 *            ���еļ�¼��
	 * @param pageSize
	 *            ÿҳ�ļ�¼��
	 * @param data
	 *            ҳ������
	 */
	public Page(int currentPageNo, long totalCount, int pageSize, List data) {
		if (0 > pageSize)
			throw new IllegalStateException("ҳ������ݴ�С����Ϊ0��");
		this.dataCountInOnePage = pageSize;
		this.currentPageNo = currentPageNo;
		this.totalDataCount = totalCount;
		this.data = data;
		if (this.currentPageNo >= this.getTotalPageCount()) {
			this.currentPageNo = (int) (this.getTotalPageCount());
		} else {
			this.currentPageNo = currentPageNo;
		}
	}

	/**
	 * ����ҳ�����������
	 */
	public long getTotalDataCount() {
		return this.totalDataCount;
	}

	/**
	 * ҳ������
	 */
	public long getTotalPageCount() {
		if (totalDataCount % dataCountInOnePage == 0)
			return totalDataCount / dataCountInOnePage;
		else
			return totalDataCount / dataCountInOnePage + 1;
	}

	/**
	 * ҳ����������
	 */
	public int getDataCountInOnePage() {
		return dataCountInOnePage;
	}

	/**
	 * ҳ������
	 */
	public List getData() {
		return data;
	}

	/**
	 * ��ǰҳ
	 */
	public int getCurrentPageNo() {
		return currentPageNo;
	}

	/**
	 * ��ǰҳ�Ƿ�����һҳ
	 */
	public boolean hasNextPage() {
		return this.getCurrentPageNo() < this.getTotalPageCount() - 1;
	}

	/**
	 * ��ǰҳ�Ƿ���ǰһҳ
	 */
	public boolean hasPreviousPage() {
		return this.getCurrentPageNo() > 0;
	}

	/**
	 * ��ȡҳ��ĵ�һ�����������������е����� Ĭ��ÿҳ��װ�ص��������Ϊ20����5ҳ�ĵ�һ�����������������е�����Ϊ100
	 */
	public static int getStartOfPage(int pageNo) {
		return getStartOfPage(pageNo, DEFAULT_DATA_SIZE_IN_ONE_PAGE);
	}

	/**
	 * ��ȡҳ��ĵ�һ�����������������е����� ���磬ÿҳ��װ�ص����������Ϊ30����3ҳ�ĵ�һ�����������������е�����Ϊ90
	 */
	public static int getStartOfPage(int pageNo, int pageSize) {
		if (0 > pageNo)
			throw new IllegalArgumentException("ҳ����������С��0!");
		return pageNo * pageSize;
	}
}
