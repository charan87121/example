package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="student")
public class Stud {
public String studname;
public String studclass;
public String studroll;
public String studadd;
public String getStudname() {
	return studname;
}
public void setStudname(String studname) {
	this.studname = studname;
}
public String getStudclass() {
	return studclass;
}
public void setStudclass(String studclass) {
	this.studclass = studclass;
}
public String getStudroll() {
	return studroll;
}

public void setStudroll(String studroll) {
	this.studroll = studroll;
}
public String getStudadd() {
	return studadd;
}
public void setStudadd(String studadd) {
	this.studadd = studadd;
}
@Override
public String toString() {
	return "Stud [studname=" + studname + ", studclass=" + studclass + ", studroll=" + studroll + ", studadd=" + studadd
			+ "]";
}

	
}
