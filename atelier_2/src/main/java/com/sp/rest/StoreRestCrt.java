  package com.sp.rest;

  import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.web.bind.annotation.PathVariable;
  import org.springframework.web.bind.annotation.RequestBody;
  import org.springframework.web.bind.annotation.RequestMapping;
  import org.springframework.web.bind.annotation.RequestMethod;
  import org.springframework.web.bind.annotation.RestController;


  import com.sp.model.TransactionDTO;
  import com.sp.service.TransactionService;


@RestController
public class StoreRestCrt {
	@Autowired
    TransactionService tservice;

	@RequestMapping(method=RequestMethod.POST, value="/buy")
	public String buy(@RequestBody TransactionDTO transactionDTO) {
		String log = tservice.buyCard(transactionDTO);
		return log;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/sell")
	public String sell(@RequestBody TransactionDTO transactionDTO) {
		String log = tservice.sellCard(transactionDTO);
		return log;
	}
	
	
	@RequestMapping(value="/transactions")
	public List<TransactionDTO> getTransactions() {
		return tservice.getTransactions();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/vente/{id1}/{id2}")
	public String getMsg(@PathVariable int iduser1, @PathVariable int iduser2) {
		int msg1=iduser1;
		int msg2=iduser2;
		return "Vente entre: acheteur:"+msg1+"vendeur:"+msg2;
	}
	
	
}

