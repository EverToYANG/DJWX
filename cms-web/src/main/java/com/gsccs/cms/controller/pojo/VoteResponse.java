package com.gsccs.cms.controller.pojo;

import java.util.ArrayList;
import java.util.List;

import com.gsccs.cms.module.model.VoteItem;
import com.gsccs.cms.module.model.VoteTopic;

public class VoteResponse {

	private VoteTopic topic;
	private List<VoteItem> itemList;
	
	public VoteTopic getTopic() {
		return topic;
	}

	public void setTopic(VoteTopic topic) {
		this.topic = topic;
	}

	public List<VoteItem> getItemList() {
		List<VoteItem> list = new ArrayList<>();
		if (null != itemList && itemList.size()>0){
			Integer sum = 0;
			for(VoteItem voteItem:itemList){
				sum = sum+voteItem.getSelectnum();
			}
			
			for(VoteItem voteItem:itemList){
				if (sum.intValue()==0){
					voteItem.setRatenum(0.0f);
				}else{
					float num=(float)(Math.round(voteItem.getSelectnum()*1.0/sum*100.0*100)/100);
					voteItem.setRatenum(num);
				}
				list.add(voteItem);
			}
		}
		itemList = list;
		return itemList;
	}

	public void setItemList(List<VoteItem> itemList) {
		this.itemList = itemList;
		
	}
	
	public static void main(String[] args) {
		Integer sum = 109;
		Integer selnum = 103;
		
		float num=(float)(Math.round(103*1.0/109*100.0*100)/100);
		System.out.println(num);
	}
	

}
