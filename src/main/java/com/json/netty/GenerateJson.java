package com.json.netty;

import java.io.IOException;

import org.apache.camel.Exchange;
import org.jpos.iso.ISOException;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.netty.util.JsonResult;

@Service
public class GenerateJson {
	public String generate(Exchange exchange) throws ISOException {
		System.out.println("Inside method generate :");
		String name = exchange.getIn().getHeader("name").toString();
		JsonResult jsonRes = new JsonResult();
		jsonRes.assignValue(name, name, name, name);
		// Creating Object of ObjectMapper define in Jakson Api
		ObjectMapper ObjMapper = new ObjectMapper();
		String finalreturn = "";
		try {

			// get Oraganisation object as a json string
			finalreturn = ObjMapper.writeValueAsString(jsonRes);

			// Displaying JSON String
			System.out.println(finalreturn);
		}

		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("=====================================");
		System.out.println("finalreturn : " + finalreturn);
		return finalreturn;

	}

}