package com.gsccs.cms.controller.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gsccs.cms.bass.utils.ResponseUtil;
import com.gsccs.cms.controller.pojo.VoteResponse;
import com.gsccs.cms.module.model.VoteItem;
import com.gsccs.cms.module.model.VoteTopic;
import com.gsccs.cms.module.service.VoteService;

/**
 * 网上调查
 * 
 * @author x.d zhang
 * @version 1.0
 */
@Controller("WebVoteController")
@RequestMapping("/web/{appid}")
public class WebVoteController {
	
	
	@Resource
	private VoteService voteService;

	/**
	 * 投票页面
	 * 
	 * @return
	 */
	@RequestMapping("/vote.html")
	public String vote(@PathVariable String appid,ModelMap map) {
		List<VoteResponse> voteList = new ArrayList<>();
		VoteTopic param = new VoteTopic();
		param.setSiteid(appid);
		List<VoteTopic> topicList = voteService.find(param, null, 1, Integer.MAX_VALUE, true);
		if (null != topicList){
			for(VoteTopic topic:topicList){
				VoteResponse voteResponse = new VoteResponse();
				voteResponse.setTopic(topic);
				List<VoteItem> itemList = voteService.findByTopicId(topic.getId(), "1", true);
				voteResponse.setItemList(itemList);
				voteList.add(voteResponse);
			}
		}
		map.put("voteList", voteList);
		return "web/vote_form";
	}
	
	/**
	 * 投票结果
	 * 
	 * @return
	 */
	@RequestMapping("/voteresult.html")
	public String voteresult(@PathVariable String appid,ModelMap map) {
		List<VoteResponse> voteList = new ArrayList<>();
		VoteTopic param = new VoteTopic();
		param.setSiteid(appid);
		List<VoteTopic> topicList = voteService.find(param, null, 1, Integer.MAX_VALUE, true);
		if (null != topicList){
			for(VoteTopic question:topicList){
				VoteResponse voteResponse = new VoteResponse();
				voteResponse.setTopic(question);
				List<VoteItem> answersList = voteService.findByTopicId(question.getId(), "1", true);
				voteResponse.setItemList(answersList);
				voteList.add(voteResponse);
			}
		}
		map.put("voteList", voteList);
		return "web/vote_result";
	}

	/**
	 * 投票处理
	 * 
	 * @return
	 */
	@RequestMapping("/answer.html")
	public String questionAnswer(@PathVariable String appid,String itemids, ModelMap map,
			HttpServletRequest request,HttpServletResponse response) {
		String msg = "";
		if (itemids != null && itemids.trim().length() > 0) {
			String[] vals = itemids.split(",");
			if (vals != null && vals.length > 0) {
				for (int i = 0; i < vals.length; i++) {
					voteService.selectnum(vals[i]);
				}
				msg = "投票成功";
			} else {
				msg = "请选择答案";
			}
		} else {
			msg = "请选择答案";
		}
		ResponseUtil.writeUTF(response, msg);
		return null;
	}

}
