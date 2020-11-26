package com.webapp.mvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="credit")
public class credit {
	
@Id
@Column(name="pan_number")
private String panNo;

@Column(name="cc_score")
private double score;

public String getPanNo() {
	return panNo;
}

public void setPanNo(String panNo) {
	this.panNo = panNo;
}

public double getScore() {
	return score;
}

public void setScore(double score) {
	this.score = score;
}

@Override
public String toString() {
	return "credit [panNo=" + panNo + ", score=" + score + "]";
}



}
