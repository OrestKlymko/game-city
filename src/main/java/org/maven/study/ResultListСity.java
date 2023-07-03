package org.maven.study;

import java.util.LinkedList;

public class ResultList {
	private LinkedList<String> resultList = new LinkedList<>();

	public LinkedList<String> getResultList() {
		return resultList;
	}

	public void addToList(String city){
		if(isExistInList(city)){
			System.out.println("City already in list");
			return;
		};
		resultList.add(city);
	}

	public boolean isExistInList(String city){
		return resultList.stream().anyMatch(i -> i.equals(city));

	}
}
