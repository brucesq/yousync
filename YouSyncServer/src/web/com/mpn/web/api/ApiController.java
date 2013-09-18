/**
 * 
 */
package com.mpn.web.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mpn.json.BasicResponse;
import com.mpn.json.UserResponse;
import com.mpn.sd.InstallRecord;
import com.mpn.sd.SoftwareItem;
import com.mpn.sd.User;
import com.mpn.service.AccountService;
import com.mpn.service.BussinessService;
import com.mpn.service.GloableService;

/**
 * @author quanzhi
 *
 */
@Controller
@RequestMapping(value = "/api")
public class ApiController {

	@Autowired
	private AccountService accountService;
	
	@Autowired
	private BussinessService bussinessService;
	
	@Autowired
	private GloableService gloableService;
	
	@RequestMapping(value = "user/login")
	public @ResponseBody UserResponse updateForm(@RequestParam(value = "username") String name,@RequestParam(value = "password") String password, Model model) {
		
		User user = accountService.getUser(name, password);
		UserResponse res = new UserResponse();
		if(user == null){
			res.setCode(500);
			res.setMessage("");
			res.setName("");
	
		}else{
			res.setCode(200);
			res.setMessage("successful");
			res.setName(user.getName());
			res.setUserId(user.getId());
			res.setChannels(user.getChannels());
		}
		return res;
	}
	
	@RequestMapping(value = "record")
	public @ResponseBody BasicResponse updateForm(@RequestParam(value = "softid") Long softId,
			@RequestParam(value = "version") String version,
			@RequestParam(value = "userid") Long userId,
			@RequestParam(value = "devicenum") String deviceNum,
			@RequestParam(value = "devicebrand") String deviceBrand,
			@RequestParam(value = "softname") String softName,
			@RequestParam(value = "macaddr") String macAddr,
			HttpServletRequest request) {
		InstallRecord record = new InstallRecord();
		record.setCreateTime(new Date());
		record.setDeviceBrand(deviceBrand);
		record.setDeviceNum(deviceNum);
		record.setSoftId(softId);
		record.setSoftName(softName);
		record.setSoftVersion(version);
		record.setUserId(userId);
		record.setRemoteIp(request.getRemoteAddr());
		record.setMacAddr(macAddr);
		
		bussinessService.saveInstallRecord(record);
		
		BasicResponse res = new BasicResponse();
		res.setCode(200);
		return res;
	} 
	
	
	@RequestMapping(value = "version")
	public void version(HttpServletRequest request,HttpServletResponse response) throws Exception{
		String channels = request.getParameter("channels");
		String version = bussinessService.getVersion();
		response.getWriter().write(version+channels);
	}
	
	
	
	@RequestMapping(value = "softdb")
	public void softDb(Model model,HttpServletRequest request,HttpServletResponse response) throws Exception{
		String channels = request.getParameter("channels");
		Iterable<SoftwareItem> softs = bussinessService.getAllSoftItem();
		List<String> userChannelList = new ArrayList<String>();
		if(channels != null){
			userChannelList = getChannels(channels);
		}
		if(userChannelList.size() < 1){
			userChannelList.add("1");
		}
		String PRIFIX_UTL = gloableService.getDownloadUrl();
		String SPLIT = "###";
		response.setContentType("text/plain; charset=utf-8");
		for(SoftwareItem item : softs){
			if(!"enabled".equals(item.getStatus())){
				continue;
			}
			List<String> channelList = getChannels(item.getChannels());
			if(!isInList(userChannelList,channelList)){
				continue;
			}
			
			StringBuilder builder = new StringBuilder();
			builder.append(bussinessService.encode(item.getName()));
			builder.append(SPLIT);
			builder.append(bussinessService.encode(PRIFIX_UTL + item.getIconUrl()));
			builder.append(SPLIT);		
			builder.append(bussinessService.encode(item.getSoftType()));
			builder.append(SPLIT);			
			builder.append(bussinessService.encode(PRIFIX_UTL + item.getApkFile()));
			builder.append(SPLIT);	
			builder.append(bussinessService.encode(item.getVersion()));
			builder.append(SPLIT);
			builder.append(bussinessService.encode(item.getPackageName()));
			builder.append(SPLIT);
			
			builder.append(bussinessService.encode(""+item.getId()));
			
			response.getWriter().println(builder.toString());
			
//			model.addAttribute("softdb", builder.toString());
		}
		response.flushBuffer();
//		return "api/softdb";
	}
	
	private List<String> getChannels(String channels){
		String[] channelStrs = channels.split("@");
		List<String> channelList = new ArrayList<String>();
		for(String str:channelStrs){
			if(str.length()>0){
				channelList.add(str);
			}
		}
		return channelList;
	}
	
	private boolean isInList(List<String> allList,List<String> inList){
		for(String str : inList){
			if(allList.contains(str))
				return true;
		}
		return false;
	}
}
