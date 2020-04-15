package com.json.netty;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import org.apache.camel.Exchange;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@Service
public class PreGenerateFixedLength {
	public String randomNumeric(int n) {
		return RandomStringUtils.randomNumeric(n);
	}

	public String randomAlphabetic(int n) {
		return RandomStringUtils.randomAlphabetic(n);
	}

	public String randomAlphanumeric(int n) {
		return RandomStringUtils.randomAlphanumeric(n);
	}

	public List<Map<String, String>> generate(String inputVal) {
		List<Map<String, String>> flResultList = new ArrayList<Map<String, String>>();
		String desc = "";
		String ops = "";
		System.out.println("INSIDE METHOD GENERATE FL - REQ ");
		System.out.println(inputVal);
		JsonParser parser = new JsonParser();
		JsonElement jsonElement = parser.parse(inputVal);
		JsonObject rootObject = jsonElement.getAsJsonObject();
		ops = rootObject.get("ops").getAsString();
		JsonObject childObject = rootObject.getAsJsonObject("basic"); // get place object
		desc = childObject.get("remark").getAsString();
		System.out.println("ops :" + ops);
		System.out.println("desc :" + desc);
		System.out.println("==============================================");
		Map<String, String> map = new HashMap<>();
		map.put("UNKNOWN1", StringUtils.rightPad(randomAlphabetic(10).toUpperCase(), 10, " "));
		map.put("UNKNOWN2", StringUtils.rightPad(randomNumeric(31), 31, " "));
		map.put("UNKNOWN3", StringUtils.rightPad("XXX", 3, " "));
		map.put("UNKNOWN4", StringUtils.rightPad(randomNumeric(32), 34, " "));
		map.put("UNKNOWN5", StringUtils.rightPad(
				randomAlphanumeric(12) + "-" + randomAlphanumeric(4) + "-" + randomAlphanumeric(4), 42, " "));
		map.put("UNKNOWN6", StringUtils.rightPad(randomAlphabetic(3).toUpperCase(), 3, " "));
		map.put("UNKNOWN7", StringUtils
				.rightPad(randomAlphanumeric(12) + "-1DF3-11E9-8A54-" + randomAlphanumeric(12), 57, " "));
		map.put("DESC", StringUtils.rightPad(desc, 100, " "));
		map.put("OPS", StringUtils.rightPad(ops, 15, " "));
		map.put("UNKNOWN10", StringUtils.rightPad("R10KRXTN", 24, " "));

		flResultList.add(map);
		return flResultList;
	}

}
