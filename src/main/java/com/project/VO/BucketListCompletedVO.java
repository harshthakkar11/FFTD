package com.project.VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bucket_list_completed_tbl")
public class BucketListCompletedVO {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bucketListCompletedId;
	
	@Column
	private String fileName;
	
	@ManyToOne
	private BucketListVO bucketListVO;

	public int getBucketListCompletedId() {
		return bucketListCompletedId;
	}

	public void setBucketListCompletedId(int bucketListCompletedId) {
		this.bucketListCompletedId = bucketListCompletedId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public BucketListVO getBucketListVO() {
		return bucketListVO;
	}

	public void setBucketListVO(BucketListVO bucketListVO) {
		this.bucketListVO = bucketListVO;
	}
}
